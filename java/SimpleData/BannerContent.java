package tbclient.SimpleData;

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
/* loaded from: classes9.dex */
public final class BannerContent extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<BannerShowUrl> DEFAULT_CLICK_URLS;
    public static final Integer DEFAULT_EMPTY_GOODS;
    public static final String DEFAULT_EXTRA_JSON = "";
    public static final String DEFAULT_EXTRA_PARAM = "";
    public static final List<Operate> DEFAULT_OPERATE;
    public static final List<BannerShowUrl> DEFAULT_SHOW_URLS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)
    public final AdCommon ad_common;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BannerShowUrl> click_urls;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer empty_goods;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String extra_json;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String extra_param;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Operate> operate;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerShowUrl> show_urls;
    @ProtoField(tag = 5)
    public final Video video;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public AdCommon ad_common;
        public List click_urls;
        public Integer empty_goods;
        public String extra_json;
        public String extra_param;
        public List operate;
        public List show_urls;
        public Video video;

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
        public Builder(BannerContent bannerContent) {
            super(bannerContent);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bannerContent};
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
            if (bannerContent == null) {
                return;
            }
            this.ad_common = bannerContent.ad_common;
            this.show_urls = Message.copyOf(bannerContent.show_urls);
            this.click_urls = Message.copyOf(bannerContent.click_urls);
            this.operate = Message.copyOf(bannerContent.operate);
            this.video = bannerContent.video;
            this.extra_json = bannerContent.extra_json;
            this.empty_goods = bannerContent.empty_goods;
            this.extra_param = bannerContent.extra_param;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerContent build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BannerContent(this, z, null);
            }
            return (BannerContent) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1816268439, "Ltbclient/SimpleData/BannerContent;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1816268439, "Ltbclient/SimpleData/BannerContent;");
                return;
            }
        }
        DEFAULT_SHOW_URLS = Collections.emptyList();
        DEFAULT_CLICK_URLS = Collections.emptyList();
        DEFAULT_OPERATE = Collections.emptyList();
        DEFAULT_EMPTY_GOODS = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerContent(Builder builder, boolean z) {
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
            this.ad_common = builder.ad_common;
            List list = builder.show_urls;
            if (list == null) {
                this.show_urls = DEFAULT_SHOW_URLS;
            } else {
                this.show_urls = Message.immutableCopyOf(list);
            }
            List list2 = builder.click_urls;
            if (list2 == null) {
                this.click_urls = DEFAULT_CLICK_URLS;
            } else {
                this.click_urls = Message.immutableCopyOf(list2);
            }
            List list3 = builder.operate;
            if (list3 == null) {
                this.operate = DEFAULT_OPERATE;
            } else {
                this.operate = Message.immutableCopyOf(list3);
            }
            this.video = builder.video;
            String str = builder.extra_json;
            if (str == null) {
                this.extra_json = "";
            } else {
                this.extra_json = str;
            }
            Integer num = builder.empty_goods;
            if (num == null) {
                this.empty_goods = DEFAULT_EMPTY_GOODS;
            } else {
                this.empty_goods = num;
            }
            String str2 = builder.extra_param;
            if (str2 == null) {
                this.extra_param = "";
                return;
            } else {
                this.extra_param = str2;
                return;
            }
        }
        this.ad_common = builder.ad_common;
        this.show_urls = Message.immutableCopyOf(builder.show_urls);
        this.click_urls = Message.immutableCopyOf(builder.click_urls);
        this.operate = Message.immutableCopyOf(builder.operate);
        this.video = builder.video;
        this.extra_json = builder.extra_json;
        this.empty_goods = builder.empty_goods;
        this.extra_param = builder.extra_param;
    }

    public /* synthetic */ BannerContent(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
