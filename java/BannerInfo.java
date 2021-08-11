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
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BannerInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<GodBanner> DEFAULT_GOD_BANNER_LIST;
    public static final String DEFAULT_GOD_GOOD_URL = "";
    public static final String DEFAULT_GOD_RANK_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GodBanner> god_banner_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String god_good_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String god_rank_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BannerInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<GodBanner> god_banner_list;
        public String god_good_url;
        public String god_rank_url;

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
        public Builder(BannerInfo bannerInfo) {
            super(bannerInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bannerInfo};
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
            if (bannerInfo == null) {
                return;
            }
            this.god_banner_list = Message.copyOf(bannerInfo.god_banner_list);
            this.god_good_url = bannerInfo.god_good_url;
            this.god_rank_url = bannerInfo.god_rank_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BannerInfo(this, z, null) : (BannerInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-314413481, "Ltbclient/BannerInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-314413481, "Ltbclient/BannerInfo;");
                return;
            }
        }
        DEFAULT_GOD_BANNER_LIST = Collections.emptyList();
    }

    public /* synthetic */ BannerInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerInfo(Builder builder, boolean z) {
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
            List<GodBanner> list = builder.god_banner_list;
            if (list == null) {
                this.god_banner_list = DEFAULT_GOD_BANNER_LIST;
            } else {
                this.god_banner_list = Message.immutableCopyOf(list);
            }
            String str = builder.god_good_url;
            if (str == null) {
                this.god_good_url = "";
            } else {
                this.god_good_url = str;
            }
            String str2 = builder.god_rank_url;
            if (str2 == null) {
                this.god_rank_url = "";
                return;
            } else {
                this.god_rank_url = str2;
                return;
            }
        }
        this.god_banner_list = Message.immutableCopyOf(builder.god_banner_list);
        this.god_good_url = builder.god_good_url;
        this.god_rank_url = builder.god_rank_url;
    }
}
