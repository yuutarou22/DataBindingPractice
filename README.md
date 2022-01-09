# DataBindingPractice

## 参考文献
[【Android】はじめてのDataBinding](https://qiita.com/iTakahiro/items/b5fe2b186750c6e774e5)

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