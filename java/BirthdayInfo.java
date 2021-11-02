package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class BirthdayInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AGE;
    public static final Integer DEFAULT_BIRTHDAY_SHOW_STATUS;
    public static final Long DEFAULT_BIRTHDAY_TIME;
    public static final String DEFAULT_CONSTELLATION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer age;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer birthday_show_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long birthday_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String constellation;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<BirthdayInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer age;
        public Integer birthday_show_status;
        public Long birthday_time;
        public String constellation;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(BirthdayInfo birthdayInfo) {
            super(birthdayInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {birthdayInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (birthdayInfo == null) {
                return;
            }
            this.birthday_time = birthdayInfo.birthday_time;
            this.birthday_show_status = birthdayInfo.birthday_show_status;
            this.constellation = birthdayInfo.constellation;
            this.age = birthdayInfo.age;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BirthdayInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BirthdayInfo(this, z, null) : (BirthdayInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(108533798, "Ltbclient/BirthdayInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(108533798, "Ltbclient/BirthdayInfo;");
                return;
            }
        }
        DEFAULT_BIRTHDAY_TIME = 0L;
        DEFAULT_BIRTHDAY_SHOW_STATUS = 0;
        DEFAULT_AGE = 0;
    }

    public /* synthetic */ BirthdayInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.birthday_time;
            if (l == null) {
                this.birthday_time = DEFAULT_BIRTHDAY_TIME;
            } else {
                this.birthday_time = l;
            }
            Integer num = builder.birthday_show_status;
            if (num == null) {
                this.birthday_show_status = DEFAULT_BIRTHDAY_SHOW_STATUS;
            } else {
                this.birthday_show_status = num;
            }
            String str = builder.constellation;
            if (str == null) {
                this.constellation = "";
            } else {
                this.constellation = str;
            }
            Integer num2 = builder.age;
            if (num2 == null) {
                this.age = DEFAULT_AGE;
                return;
            } else {
                this.age = num2;
                return;
            }
        }
        this.birthday_time = builder.birthday_time;
        this.birthday_show_status = builder.birthday_show_status;
        this.constellation = builder.constellation;
        this.age = builder.age;
    }
}
