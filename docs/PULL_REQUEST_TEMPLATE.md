
# Headers
Start with what type of change you are making
a) feat - feature
b) fix - fix a bug

After, type a short description about your change.
> "fix: no more infinite loop"

You may add a scope to your changes by putting it in brackets or a ! if the change is important.
> "fix(mainApp)!: no more infinite loop"

# Body
This is optional, but you may elaborate in more detail about your change

# Footers
You may add the following optional footers
a) BREAKING CHANGE
b) Reviewed by
c) Refs (Issue Reference ID)

# Full example:

> fix: prevent racing of requests  
Introduce a request id and a reference to latest request. Dismiss  
incoming responses other than from latest request.  
Remove timeouts which were used to mitigate the racing issue but are  
obsolete now.  
Reviewed-by: Z  
Refs: #123  
