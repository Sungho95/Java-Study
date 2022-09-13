package Section1.generic;

class Phone {
}

class Galaxy extends Phone {
}

class IPhone extends Phone {
}

// 갤럭시 시리즈
class GalaxyS extends Galaxy {
}
class GalaxyNote extends Galaxy {
}

// 아이폰 시리즈
class IPhonePro extends IPhone {
}
class IPhoneMini extends IPhone {
}

class User<T> {
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}

class PhoneFun {
    public static void call(User<? extends Phone> user) {
        System.out.println(user.phone.getClass().getSimpleName());
    }

    public static void faceId(User<? extends IPhone> user) {
        System.out.println(user.phone.getClass().getSimpleName());
    }

    public static void samsungPay(User<? extends Galaxy> user) {
        System.out.println(user.phone.getClass().getSimpleName());
    }

    public static void recordVoice(User<? super Galaxy> user) {
        System.out.println(user.phone.getClass().getSimpleName());
    }
}

public class PhoneEx {
    public static void main(String[] args) {

        // call 기능 확인 (모두 사용 가능)
        PhoneFun.call(new User<Phone>(new Phone()));
        PhoneFun.call(new User<Galaxy>(new Galaxy()));
        PhoneFun.call(new User<IPhone>(new IPhone()));
        PhoneFun.call(new User<GalaxyS>(new GalaxyS()));
        PhoneFun.call(new User<GalaxyNote>(new GalaxyNote()));
        PhoneFun.call(new User<IPhonePro>(new IPhonePro()));
        PhoneFun.call(new User<IPhoneMini>(new IPhoneMini()));

        System.out.println();

        // samsungPay 기능 확인 (갤럭시만 사용 가능)
        PhoneFun.samsungPay(new User<GalaxyS>(new GalaxyS()));
        PhoneFun.samsungPay(new User<GalaxyNote>(new GalaxyNote()));
        PhoneFun.samsungPay(new User<Galaxy>(new Galaxy()));
//        PhoneFun.samsungPay(new User<Phone>(new Phone()));
//        PhoneFun.samsungPay(new User<IPhone>(new IPhone()));
//        PhoneFun.samsungPay(new User<IPhonePro>(new IPhonePro()));
//        PhoneFun.samsungPay(new User<IPhoneMini>(new IPhoneMini()));

        System.out.println();

        // faceId 기능 확인 (아이폰만 사용 가능)
        PhoneFun.faceId(new User<IPhone>(new IPhone()));
        PhoneFun.faceId(new User<IPhonePro>(new IPhonePro()));
        PhoneFun.faceId(new User<IPhoneMini>(new IPhoneMini()));
//        PhoneFun.faceId(new User<GalaxyS>(new GalaxyS()));
//        PhoneFun.faceId(new User<GalaxyNote>(new GalaxyNote()));
//        PhoneFun.faceId(new User<Galaxy>(new Galaxy()));
//        PhoneFun.faceId(new User<Phone>(new Phone()));

        System.out.println();

        // recordVoice 기능 확인 (아이폰을 제외한 휴대폰 사용 가능)
        PhoneFun.recordVoice(new User<Galaxy>(new Galaxy()));
        PhoneFun.recordVoice(new User<Phone>(new Phone()));
//        PhoneFun.recordVoice(new User<IPhone>(new IPhone()));
//        PhoneFun.recordVoice(new User<IPhonePro>(new IPhonePro()));
//        PhoneFun.recordVoice(new User<IPhoneMini>(new IPhoneMini()));
//        PhoneFun.recordVoice(new User<GalaxyS>(new GalaxyS()));
//        PhoneFun.recordVoice(new User<GalaxyNote>(new GalaxyNote()));

    }

}

