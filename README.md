# spring-boot-core-principle-basic
스프링 핵심 원리 - 기본

- AllBeanTest : 전략패턴으로 구현객체 활용 하기
- AutoWiredTest : @Autowired TEST
- BeanDefinitionTest : 빈 설정 메타정보 확인
- ApplicationContextBasicFindTest : 모든 빈 출력하기, 애플리케이션 빈 출력하기
- ApplicationContextExtendsFindTest : 
  - 부모 타입으로 조회시, 자식이 둘 이상 있으면, 중복 오류가 발생한다
  - 부모 타입으로 조회시, 자식이 둘 이상 있으면, 빈 이름을 지정하면 된다
  - 특정 하위 타입으로 조회
  - 부모 타입으로 모두 조회하기
  - 부모 타입으로 모두 조회하기 - Object 
- ApplicationContextInfoTest
  - 빈 이름으로 조회
  - 이름 없이 타입만으로 조회
  - 구체 타입으로 조회
  - 빈 이름으로 조회X
 - ApplicationContextSameBeanFindTest
  - 타입으로 조회시 같은 타입이 둘 이상 있으면, 중복 오류가 발생한다
  - 타입으로 조회시 같은 타입이 둘 이상 있으면, 빈 이름을 지정하면 된다
  - 특정 타입을 모두 조회하기
 - RateDiscountPolicyTest
  - VIP는 10% 할인이 적용되어야 한다.
  - VIP가 아니면 할인이 적용되지 않아야 한다.
 - BeanLifeCycleTest : 라이프사이클 @PreDestroy, @PostConstruct
 - MemberServiceTest : 맴버객체 TEST
 - OrderServiceImplTest : 주문객체 TEST
 - OrderServiceTest : 주문생성 TEST
 - AutoAppConfigTest : @ComponentScan TEST
 - ComponentFilterAppConfigTest: @ComponentScan Filter TEST
 - PrototypeTest : scope prototype TEST
 - SingletonTest : scope singleton TEST
 - SingletonWithPrototypeTest1
  - 프로토타입 스코프는 객체가 다르기 떄문에 서로다른 참조값에서 데이터를 가져온다.
  - 싱글톤 컨테이너에 프로토타입을 사용 할 경우 같은 객체를 재사용한다. 하지만 provider 를 사용하면 dl 을 통해 새로운 객체를 생성을 해준다.