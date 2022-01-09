# DataBindingPractice

## 参考文献
- [【Android】はじめてのDataBinding](https://qiita.com/iTakahiro/items/b5fe2b186750c6e774e5)
- [どうしてもCannot access class '〇〇'. Check your module classpath for missing or conflicting dependenciesでエラーする。](https://qiita.com/kkkkan/items/a81fae9fe5ff5de928ce)
    - パッケージ名を大文字始まりにしてしまっていた。ミスった。
    - Fragment → fragment
    - ViewModel → viewModel

## 学習メモ

- Fragmentの作成
    - 今回はMainActivityにブッ込んどくだけ。
    
### DataBindingの導入

- build.gradle(Module:app)
    - dataBindingを有効化
    - Syncを忘れずに
- layout.xml
    - `option + Enter`
    - `Convert to data binding layout`を選択

### レイアウトとコードの紐付け

- layout.xml
    - variableタグ
        - name（変数名）
        - type（型）
    - `@{name}`でDataBindingを実装できる
- Fragment
    - Bindingクラスは、ViewDataBindingクラスを継承している
    - DataBindingを実装しビルドしたら自動生成される
    - onCreateViewの戻り値に`binding.root`を指定することでFragmentのレイアウトを設定できる
    - `binding.textButton = "aaa"`でできちゃう

### ViewModelを作成

- LiveData
    - 値がセットされた時に、値がセットされたことを検知できるクラス
    - 実際に値が入る時は、MutableLiveDataであり、LiveDataに直接値が入るわけではない。
- MutableLiveData
    - 変更可能なLiveData

### layout.xmlにViewModelを導入

- dataタグで定義した変数を書き換える

### FragmentにViewModelを導入

- 