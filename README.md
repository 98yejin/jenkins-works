# jenkins-works


## Declarative Pipeline Examples
### PT Checkbox, Matrix : [Link](https://github.com/98yejin/jenkins-works/blob/main/DeclarativePipeline/PT_CHECKBOX_with_Matrix/Jenkinsfile)
```
- declarative pipeline 에서 matrix 를 사용해서 병렬 빌드를 할 때, dynamic array를 허용하지  않음
- 따라서 PT_CHECKBOX 로 인자를 받을 때, when 을 사용해서 조건부 실행 되도록 처리 
- 참고
1. https://issues.jenkins.io/browse/JENKINS-62127
2. https://stackoverflow.com/questions/59844846/declarative-pipeline-with-dynamic-matrix-axis-values
3. https://plugins.jenkins.io/uno-choice/
4. https://www.jenkins.io/doc/book/pipeline/syntax/

```
### Stash/Unstash : [Link](https://github.com/98yejin/jenkins-works/blob/main/DeclarativePipeline/Stash_and_Unstash/Jenkinsfile)
```
Jenkins 는 기본적으로 Workspace 가 지워지거나, 유지되는 것을 보장하지 않음
파일 공유를 위해서는 Stash 를 사용하는 것이 적합함
```

