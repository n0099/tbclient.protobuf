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
/* loaded from: classes9.dex */
public final class AdMixFloor extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ADVERTISE_ID = "";
    public static final Long DEFAULT_AD_ID;
    public static final Integer DEFAULT_AD_TYPE;
    public static final Integer DEFAULT_FLOOR_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long ad_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer ad_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String advertise_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdMixFloor> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long ad_id;
        public Integer ad_type;
        public String advertise_id;
        public Integer floor_num;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(AdMixFloor adMixFloor) {
            super(adMixFloor);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adMixFloor};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (adMixFloor == null) {
                return;
            }
            this.ad_type = adMixFloor.ad_type;
            this.floor_num = adMixFloor.floor_num;
            this.ad_id = adMixFloor.ad_id;
            this.advertise_id = adMixFloor.advertise_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdMixFloor build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AdMixFloor(this, z, null) : (AdMixFloor) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1259284706, "Ltbclient/AdMixFloor;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1259284706, "Ltbclient/AdMixFloor;");
                return;
            }
        }
        DEFAULT_AD_TYPE = 0;
        DEFAULT_FLOOR_NUM = 0;
        DEFAULT_AD_ID = 0L;
    }

    public /* synthetic */ AdMixFloor(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdMixFloor(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.ad_type;
            if (num == null) {
                this.ad_type = DEFAULT_AD_TYPE;
            } else {
                this.ad_type = num;
            }
            Integer num2 = builder.floor_num;
            if (num2 == null) {
                this.floor_num = DEFAULT_FLOOR_NUM;
            } else {
                this.floor_num = num2;
            }
            Long l = builder.ad_id;
            if (l == null) {
                this.ad_id = DEFAULT_AD_ID;
            } else {
                this.ad_id = l;
            }
            String str = builder.advertise_id;
            if (str == null) {
                this.advertise_id = "";
                return;
            } else {
                this.advertise_id = str;
                return;
            }
        }
        this.ad_type = builder.ad_type;
        this.floor_num = builder.floor_num;
        this.ad_id = builder.ad_id;
        this.advertise_id = builder.advertise_id;
    }
}
