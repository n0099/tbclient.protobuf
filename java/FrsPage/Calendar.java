package tbclient.FrsPage;

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
/* loaded from: classes10.dex */
public final class Calendar extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_D;
    public static final Integer DEFAULT_RANK;
    public static final Integer DEFAULT_SIGN_TYPE;
    public static final String DEFAULT_T = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)

    /* renamed from: d  reason: collision with root package name */
    public final Integer f76386d;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sign_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String t;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Calendar> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: d  reason: collision with root package name */
        public Integer f76387d;
        public Integer rank;
        public Integer sign_type;
        public String t;

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
        public Builder(Calendar calendar) {
            super(calendar);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {calendar};
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
            if (calendar == null) {
                return;
            }
            this.f76387d = calendar.f76386d;
            this.t = calendar.t;
            this.rank = calendar.rank;
            this.sign_type = calendar.sign_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Calendar build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Calendar(this, z, null) : (Calendar) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-581472646, "Ltbclient/FrsPage/Calendar;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-581472646, "Ltbclient/FrsPage/Calendar;");
                return;
            }
        }
        DEFAULT_D = 0;
        DEFAULT_RANK = 0;
        DEFAULT_SIGN_TYPE = 0;
    }

    public /* synthetic */ Calendar(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Calendar(Builder builder, boolean z) {
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
            Integer num = builder.f76387d;
            if (num == null) {
                this.f76386d = DEFAULT_D;
            } else {
                this.f76386d = num;
            }
            String str = builder.t;
            if (str == null) {
                this.t = "";
            } else {
                this.t = str;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            Integer num3 = builder.sign_type;
            if (num3 == null) {
                this.sign_type = DEFAULT_SIGN_TYPE;
                return;
            } else {
                this.sign_type = num3;
                return;
            }
        }
        this.f76386d = builder.f76387d;
        this.t = builder.t;
        this.rank = builder.rank;
        this.sign_type = builder.sign_type;
    }
}
