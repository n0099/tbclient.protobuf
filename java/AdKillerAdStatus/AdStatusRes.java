package tbclient.AdKillerAdStatus;

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
public final class AdStatusRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_AD_ALIVE_COUNTDOWN;
    public static final Integer DEFAULT_AD_LEFT_NUM;
    public static final Long DEFAULT_FORUM_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer ad_alive_countdown;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer ad_left_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdStatusRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer ad_alive_countdown;
        public Integer ad_left_num;
        public Long forum_id;

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
        public Builder(AdStatusRes adStatusRes) {
            super(adStatusRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adStatusRes};
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
            if (adStatusRes == null) {
                return;
            }
            this.forum_id = adStatusRes.forum_id;
            this.ad_left_num = adStatusRes.ad_left_num;
            this.ad_alive_countdown = adStatusRes.ad_alive_countdown;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdStatusRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AdStatusRes(this, z, null);
            }
            return (AdStatusRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(29411986, "Ltbclient/AdKillerAdStatus/AdStatusRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(29411986, "Ltbclient/AdKillerAdStatus/AdStatusRes;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_AD_LEFT_NUM = 0;
        DEFAULT_AD_ALIVE_COUNTDOWN = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdStatusRes(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.ad_left_num;
            if (num == null) {
                this.ad_left_num = DEFAULT_AD_LEFT_NUM;
            } else {
                this.ad_left_num = num;
            }
            Integer num2 = builder.ad_alive_countdown;
            if (num2 == null) {
                this.ad_alive_countdown = DEFAULT_AD_ALIVE_COUNTDOWN;
                return;
            } else {
                this.ad_alive_countdown = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.ad_left_num = builder.ad_left_num;
        this.ad_alive_countdown = builder.ad_alive_countdown;
    }

    public /* synthetic */ AdStatusRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
