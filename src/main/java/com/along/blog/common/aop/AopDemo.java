//package com.along.blog.common.aop;
//
//import com.along.demo.entity.ReturnMessage;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Component
//@Aspect
//public class AopDemo {
//
//    private Logger logger = LoggerFactory.getLogger(ReturnMessageAop.class);
//
//    //controller包下面的所有方法
//    @Pointcut(value="execution(* com.along.demo.controller..*.*(..))")
//    private void ControllerCut(){}
//
//    //UserController下面的所有方法
////    @Pointcut(value="execution(* com.along.demo.controller.UserController.*(..))")
////    private void UserCut(){}
//
//
//    /**
//     * 执行顺序为：环绕前置通知 -> 前置通知 -> 后置通知 -> 环绕后置通知。
//     */
//
//    /**
//     * 前置通知
//     * @param joinPoint
//     */
//    @Before("ControllerCut()")
//    public void doBeforeRequest( JoinPoint joinPoint ){
//        System.out.println("前置通知");
//
//        //获取http请求的参数
//        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
//                .getRequestAttributes();
//        HttpServletRequest request = requestAttributes.getRequest();
//
//        String token = request.getParameter("token") ;
//        System.out.println( token );
//
//    }
//
//    /**
//     * 后置通知
//     */
//    @AfterReturning(value="ControllerCut()",returning = "result")
//    public ReturnMessage doReturnMessage(JoinPoint joinPoint , Object result ){
//        ReturnMessage message = new ReturnMessage("0" , "请求成功",result) ;
//        System.out.println( message.toString() );
//        return message ;
//    }
//
//    /**
//     * 异常
//     */
//    @AfterThrowing( value="ControllerCut()" ,throwing = "exception")
//    public void catchException( JoinPoint joinPoint,Throwable exception ){
//
//        System.out.println( "请求的方法名是："+joinPoint.getSignature().getName());
//        if( exception instanceof RuntimeException ){
//            System.out.println( exception.getMessage() );
//        }
//
//    }
//
//    /**
//     * 环绕通知
//     * @param joinPoint
//     * @return
//     * @throws Throwable
//     */
//    @Around(value="ControllerCut()")
//    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("环绕前通知================");
//        Object obj = joinPoint.proceed();                   //执行目标方法
//        System.out.println("环绕后通知================");
//        return obj;
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
