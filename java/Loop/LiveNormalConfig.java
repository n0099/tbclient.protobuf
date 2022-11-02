package tbclient.Loop;

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
public final class LiveNormalConfig extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON_SCHEME = "";
    public static final String DEFAULT_ICON_URL_DAY = "";
    public static final String DEFAULT_ICON_URL_NIGHT = "";
    public static final Integer DEFAULT_SHOW_PAGE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url_day;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url_night;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer show_page;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveNormalConfig> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon_scheme;
        public String icon_url_day;
        public String icon_url_night;
        public Integer show_page;

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
        public Builder(LiveNormalConfig liveNormalConfig) {
            super(liveNormalConfig);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveNormalConfig};
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
            if (liveNormalConfig == null) {
                return;
            }
            this.icon_url_day = liveNormalConfig.icon_url_day;
            this.icon_url_night = liveNormalConfig.icon_url_night;
            this.icon_scheme = liveNormalConfig.icon_scheme;
            this.show_page = liveNormalConfig.show_page;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveNormalConfig build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveNormalConfig(this, z, null);
            }
            return (LiveNormalConfig) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1792734053, "Ltbclient/Loop/LiveNormalConfig;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1792734053, "Ltbclient/Loop/LiveNormalConfig;");
                return;
            }
        }
        DEFAULT_SHOW_PAGE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveNormalConfig(Builder builder, boolean z) {
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
            String str = builder.icon_url_day;
            if (str == null) {
                this.icon_url_day = "";
            } else {
                this.icon_url_day = str;
            }
            String str2 = builder.icon_url_night;
            if (str2 == null) {
                this.icon_url_night = "";
            } else {
                this.icon_url_night = str2;
            }
            String str3 = builder.icon_scheme;
            if (str3 == null) {
                this.icon_scheme = "";
            } else {
                this.icon_scheme = str3;
            }
            Integer num = builder.show_page;
            if (num == null) {
                this.show_page = DEFAULT_SHOW_PAGE;
                return;
            } else {
                this.show_page = num;
                return;
            }
        }
        this.icon_url_day = builder.icon_url_day;
        this.icon_url_night = builder.icon_url_night;
        this.icon_scheme = builder.icon_scheme;
        this.show_page = builder.show_page;
    }

    public /* synthetic */ LiveNormalConfig(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
