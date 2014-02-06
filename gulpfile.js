var gulp    = require('gulp'),
    watch   = require('gulp-watch');

// Copy groovy files to webapp
gulp.task('default', function () {
    gulp.src('src/main/resources/**/*.groovy')
        .pipe(watch(function(files) {
            return files.pipe(gulp.dest('./apache-tomcat-7.0.50/webapps/counterwebapp/WEB-INF/classes/'));
        }));
});
