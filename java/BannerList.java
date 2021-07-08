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
/* loaded from: classes9.dex */
public final class BannerList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<App> DEFAULT_APP;
    public static final String DEFAULT_APPLIST = "";
    public static final List<FeedForumInfo> DEFAULT_FEED_FORUM;
    public static final List<App> DEFAULT_VIDEO_RECOMMEND_AD;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<App> app;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String applist;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedForumInfo> feed_forum;
    @ProtoField(tag = 3)
    public final RecomTopicInfo hot_topic;
    @ProtoField(tag = 5)
    public final App pb_banner_ad;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<App> video_recommend_ad;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BannerList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<App> app;
        public String applist;
        public List<FeedForumInfo> feed_forum;
        public RecomTopicInfo hot_topic;
        public App pb_banner_ad;
        public List<App> video_recommend_ad;

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
        public Builder(BannerList bannerList) {
            super(bannerList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {bannerList};
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
            if (bannerList == null) {
                return;
            }
            this.app = Message.copyOf(bannerList.app);
            this.feed_forum = Message.copyOf(bannerList.feed_forum);
            this.hot_topic = bannerList.hot_topic;
            this.applist = bannerList.applist;
            this.pb_banner_ad = bannerList.pb_banner_ad;
            this.video_recommend_ad = Message.copyOf(bannerList.video_recommend_ad);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BannerList(this, z, null) : (BannerList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-311779225, "Ltbclient/BannerList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-311779225, "Ltbclient/BannerList;");
                return;
            }
        }
        DEFAULT_APP = Collections.emptyList();
        DEFAULT_FEED_FORUM = Collections.emptyList();
        DEFAULT_VIDEO_RECOMMEND_AD = Collections.emptyList();
    }

    public /* synthetic */ BannerList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerList(Builder builder, boolean z) {
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
            List<App> list = builder.app;
            if (list == null) {
                this.app = DEFAULT_APP;
            } else {
                this.app = Message.immutableCopyOf(list);
            }
            List<FeedForumInfo> list2 = builder.feed_forum;
            if (list2 == null) {
                this.feed_forum = DEFAULT_FEED_FORUM;
            } else {
                this.feed_forum = Message.immutableCopyOf(list2);
            }
            this.hot_topic = builder.hot_topic;
            String str = builder.applist;
            if (str == null) {
                this.applist = "";
            } else {
                this.applist = str;
            }
            this.pb_banner_ad = builder.pb_banner_ad;
            List<App> list3 = builder.video_recommend_ad;
            if (list3 == null) {
                this.video_recommend_ad = DEFAULT_VIDEO_RECOMMEND_AD;
                return;
            } else {
                this.video_recommend_ad = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.app = Message.immutableCopyOf(builder.app);
        this.feed_forum = Message.immutableCopyOf(builder.feed_forum);
        this.hot_topic = builder.hot_topic;
        this.applist = builder.applist;
        this.pb_banner_ad = builder.pb_banner_ad;
        this.video_recommend_ad = Message.immutableCopyOf(builder.video_recommend_ad);
    }
}
