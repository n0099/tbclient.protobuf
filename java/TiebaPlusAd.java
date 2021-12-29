package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes5.dex */
public final class TiebaPlusAd extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_SOURCE = "";
    public static final String DEFAULT_COST_URL = "";
    public static final String DEFAULT_SHOW_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_source;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String cost_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String show_url;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<TiebaPlusAd> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_source;
        public String cost_url;
        public String show_url;

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
        public Builder(TiebaPlusAd tiebaPlusAd) {
            super(tiebaPlusAd);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tiebaPlusAd};
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
            if (tiebaPlusAd == null) {
                return;
            }
            this.cost_url = tiebaPlusAd.cost_url;
            this.show_url = tiebaPlusAd.show_url;
            this.ad_source = tiebaPlusAd.ad_source;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TiebaPlusAd build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TiebaPlusAd(this, z, null) : (TiebaPlusAd) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ TiebaPlusAd(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiebaPlusAd(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.cost_url;
            if (str == null) {
                this.cost_url = "";
            } else {
                this.cost_url = str;
            }
            String str2 = builder.show_url;
            if (str2 == null) {
                this.show_url = "";
            } else {
                this.show_url = str2;
            }
            String str3 = builder.ad_source;
            if (str3 == null) {
                this.ad_source = "";
                return;
            } else {
                this.ad_source = str3;
                return;
            }
        }
        this.cost_url = builder.cost_url;
        this.show_url = builder.show_url;
        this.ad_source = builder.ad_source;
    }
}
