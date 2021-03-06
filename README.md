# Airbrake Rax.io Demos


# RAILS DEMO - http://raxio-ruby.lifted.io
## Versions
- Rails 4.0.2
- Ubuntu 13.10
- Postgresql 9.1/main

## Generate your blog on your server
`# rails new my-new-blog`

## Add Airbrake gem
`# cd my-new-blog`  
`# vim Gemfile`  
    add: `gem 'airbrake'`

## Grab API key from your account & generate config
#### https://{coolapp}.airbrake.io/projects/{01234}/edit
`# rails generate airbrake --api-key 9b6be186689c6a85zls66c6883490b49f`

## Build some scaffolding to play with
`# rails generate scaffold Blog title:string content:text`  
`# rake db:migrate`  
`# vim config/routes.rb`   
    add: `resources :posts`   
    add: `root 'blogs#index'`   

## Add a breaking point
`# vim app/controllers/blogs_controller.rb`  
    add:    
        
        def new   
            @blog = Blog.new   
            File.open("secrets.txt")   
        end
        


## Run rails in prod
`# rails s -e production`

## Navigate to the page, you will get an error, time to check Airbrake.io

**
ActiveRecord::StatementInvalid: SQLite3::SQLException: no such table: blogs: SELECT "blogs".* FROM "blogs"
**

## Fix this error
`# rake db:migrate RAILS_ENV=production`

## Run rails in prod
`# rails s -e production`

## Navigate to page, it should load now!

Click the new button to cause the error from the controller modification earlier (blogs_controller.rb)   
Check it out on Airbrake site

# JAVA DEMO - http://raxio-java.lifted.io
