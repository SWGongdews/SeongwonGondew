
package DIpractice;

public class Main {
    public static void main(String args[]){


        iphone iphone = new iphone(); // 일체형 Battery

//객체 지향의 원리 : DI
        Battery BatteryA = new Battery(50); // 탈착형 Battery. 객체지향적인 Code
        Battery BatteryB = new Battery(70);
        Battery BatteryC = new Battery(60);

        galaxyS5 galaxyS5 = new galaxyS5(BatteryC);

        galaxyS5.setBattery(BatteryB); // 의존성을 주입

        // Inversion of Control Container : Bean 객체를 만드는  BeanFactory이다.
        // DI(galaxyS5) -> 조립이 iphone(iphone -> Battery)과 반대로 실행이 된다 -> (Battery -> galaxyS5) 이것이 Inversion of Control.
        // Container : DI를 해줘 galaxy의 set메소드에 배터리 들어가는 것처럼
        // Spring에서는 Bean(Battery) 객체를 넣어줌

        // DI를 하면 필연적으로 IoC가 되고, 이 DI를 해주는 (IoC 방식의) Container가 BeanFactory이다 (디자인패턴)
        // Bean 객체를 만든다 -> Set메소드에 넣어준다 = 의존성 주입 


        //BeanFactory.createBean("F")
        // Dummy객체 = Bean이며, 이 Bean객체 등록을 해주는 Annotation이 @Autowired이다
        
        
// 런타임 시에 관계를 다이나믹하게 주입하여 유연성을 확보하고 결합도를 낮출 수 있게 해준다.

// Container는 주문서. 근데 이제 구성요소를 생성해 가져와야함. 컨테이너를 이 흐름으로 풀이하면, 객체의 생성과 소멸(생성주기)을 관리


// 결론 : 내 코드의 처리과정을 스프링한테 넘김 -> 객체의 생성과 소멸(생성주기)을 관리 -> 이 객체가 바로 Bean이며, BeanFactory가 자바의 (IoC)Container이다.
// 이 BeanFactory는, RoF의 디자인패턴에서, Factory + Singleton 패턴을 사용한다.






    }
}



