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
/* loaded from: classes8.dex */
public final class McnAdInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AD_END_TIME;
    public static final Long DEFAULT_AD_START_TIME;
    public static final String DEFAULT_BUTTON_TITLE = "";
    public static final String DEFAULT_CARD_TITLE = "";
    public static final Long DEFAULT_EFFECT_TIME;
    public static final Long DEFAULT_EXPIRE_TIME;
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long ad_end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ad_start_time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long effect_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long expire_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<McnAdInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long ad_end_time;
        public Long ad_start_time;
        public String button_title;
        public String card_title;
        public Long effect_time;
        public Long expire_time;
        public String jump_url;
        public String pic_url;

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
        public Builder(McnAdInfo mcnAdInfo) {
            super(mcnAdInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {mcnAdInfo};
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
            if (mcnAdInfo == null) {
                return;
            }
            this.ad_start_time = mcnAdInfo.ad_start_time;
            this.ad_end_time = mcnAdInfo.ad_end_time;
            this.pic_url = mcnAdInfo.pic_url;
            this.jump_url = mcnAdInfo.jump_url;
            this.card_title = mcnAdInfo.card_title;
            this.button_title = mcnAdInfo.button_title;
            this.effect_time = mcnAdInfo.effect_time;
            this.expire_time = mcnAdInfo.expire_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public McnAdInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new McnAdInfo(this, z, null) : (McnAdInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1731970716, "Ltbclient/McnAdInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1731970716, "Ltbclient/McnAdInfo;");
                return;
            }
        }
        DEFAULT_AD_START_TIME = 0L;
        DEFAULT_AD_END_TIME = 0L;
        DEFAULT_EFFECT_TIME = 0L;
        DEFAULT_EXPIRE_TIME = 0L;
    }

    public /* synthetic */ McnAdInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McnAdInfo(Builder builder, boolean z) {
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
            Long l = builder.ad_start_time;
            if (l == null) {
                this.ad_start_time = DEFAULT_AD_START_TIME;
            } else {
                this.ad_start_time = l;
            }
            Long l2 = builder.ad_end_time;
            if (l2 == null) {
                this.ad_end_time = DEFAULT_AD_END_TIME;
            } else {
                this.ad_end_time = l2;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.card_title;
            if (str3 == null) {
                this.card_title = "";
            } else {
                this.card_title = str3;
            }
            String str4 = builder.button_title;
            if (str4 == null) {
                this.button_title = "";
            } else {
                this.button_title = str4;
            }
            Long l3 = builder.effect_time;
            if (l3 == null) {
                this.effect_time = DEFAULT_EFFECT_TIME;
            } else {
                this.effect_time = l3;
            }
            Long l4 = builder.expire_time;
            if (l4 == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
                return;
            } else {
                this.expire_time = l4;
                return;
            }
        }
        this.ad_start_time = builder.ad_start_time;
        this.ad_end_time = builder.ad_end_time;
        this.pic_url = builder.pic_url;
        this.jump_url = builder.jump_url;
        this.card_title = builder.card_title;
        this.button_title = builder.button_title;
        this.effect_time = builder.effect_time;
        this.expire_time = builder.expire_time;
    }
}
