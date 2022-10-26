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
import tbclient.App;
/* loaded from: classes9.dex */
public final class AdkillerAd extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CAN_CLOSE;
    public static final String DEFAULT_GAME_URL = "";
    public static final String DEFAULT_TAG = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3)
    public final App app;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer can_close;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public App app;
        public Integer can_close;
        public String game_url;
        public String tag;

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
        public Builder(AdkillerAd adkillerAd) {
            super(adkillerAd);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adkillerAd};
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
            if (adkillerAd == null) {
                return;
            }
            this.tag = adkillerAd.tag;
            this.game_url = adkillerAd.game_url;
            this.app = adkillerAd.app;
            this.can_close = adkillerAd.can_close;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdkillerAd build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AdkillerAd(this, z, null);
            }
            return (AdkillerAd) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;");
                return;
            }
        }
        DEFAULT_CAN_CLOSE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdkillerAd(Builder builder, boolean z) {
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
            String str = builder.tag;
            if (str == null) {
                this.tag = "";
            } else {
                this.tag = str;
            }
            String str2 = builder.game_url;
            if (str2 == null) {
                this.game_url = "";
            } else {
                this.game_url = str2;
            }
            this.app = builder.app;
            Integer num = builder.can_close;
            if (num == null) {
                this.can_close = DEFAULT_CAN_CLOSE;
                return;
            } else {
                this.can_close = num;
                return;
            }
        }
        this.tag = builder.tag;
        this.game_url = builder.game_url;
        this.app = builder.app;
        this.can_close = builder.can_close;
    }

    public /* synthetic */ AdkillerAd(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
