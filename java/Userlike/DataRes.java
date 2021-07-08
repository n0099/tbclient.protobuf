package tbclient.Userlike;

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
import tbclient.App;
import tbclient.BannerUserStory;
import tbclient.DiscoverHotForum;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final List<App> DEFAULT_APP_LIST;
    public static final Integer DEFAULT_HAS_MORE;
    public static final String DEFAULT_LAST_TIPS = "";
    public static final String DEFAULT_PAGE_TAG = "";
    public static final Long DEFAULT_REQ_UNIX;
    public static final List<ConcernData> DEFAULT_THREAD_INFO;
    public static final String DEFAULT_TOP_TIPS = "";
    public static final List<UserList> DEFAULT_USER_LIST;
    public static final String DEFAULT_USER_TIPS = "";
    public static final Integer DEFAULT_USER_TIPS_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<App> app_list;
    @ProtoField(tag = 13)
    public final BannerFollowLive banner_follow_live;
    @ProtoField(tag = 6)
    public final BannerUserStory banner_user_story;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 14)
    public final DiscoverHotForum hot_recomforum;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String last_tips;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long req_unix;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ConcernData> thread_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String top_tips;
    @ProtoField(tag = 9)
    public final UserList top_user_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UserList> user_list;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_tips;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer user_tips_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String abtest_tag;
        public List<App> app_list;
        public BannerFollowLive banner_follow_live;
        public BannerUserStory banner_user_story;
        public Integer has_more;
        public DiscoverHotForum hot_recomforum;
        public String last_tips;
        public String page_tag;
        public Long req_unix;
        public List<ConcernData> thread_info;
        public String top_tips;
        public UserList top_user_info;
        public List<UserList> user_list;
        public String user_tips;
        public Integer user_tips_type;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.thread_info = Message.copyOf(dataRes.thread_info);
            this.page_tag = dataRes.page_tag;
            this.user_list = Message.copyOf(dataRes.user_list);
            this.has_more = dataRes.has_more;
            this.user_tips = dataRes.user_tips;
            this.banner_user_story = dataRes.banner_user_story;
            this.last_tips = dataRes.last_tips;
            this.top_user_info = dataRes.top_user_info;
            this.req_unix = dataRes.req_unix;
            this.user_tips_type = dataRes.user_tips_type;
            this.top_tips = dataRes.top_tips;
            this.banner_follow_live = dataRes.banner_follow_live;
            this.hot_recomforum = dataRes.hot_recomforum;
            this.abtest_tag = dataRes.abtest_tag;
            this.app_list = dataRes.app_list;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1531639912, "Ltbclient/Userlike/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1531639912, "Ltbclient/Userlike/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_INFO = Collections.emptyList();
        DEFAULT_USER_LIST = Collections.emptyList();
        DEFAULT_HAS_MORE = 0;
        DEFAULT_REQ_UNIX = 0L;
        DEFAULT_USER_TIPS_TYPE = 0;
        DEFAULT_APP_LIST = Collections.emptyList();
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List<ConcernData> list = builder.thread_info;
            if (list == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list);
            }
            String str = builder.page_tag;
            if (str == null) {
                this.page_tag = "";
            } else {
                this.page_tag = str;
            }
            List<UserList> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            String str2 = builder.user_tips;
            if (str2 == null) {
                this.user_tips = "";
            } else {
                this.user_tips = str2;
            }
            this.banner_user_story = builder.banner_user_story;
            String str3 = builder.last_tips;
            if (str3 == null) {
                this.last_tips = "";
            } else {
                this.last_tips = str3;
            }
            this.top_user_info = builder.top_user_info;
            Long l = builder.req_unix;
            if (l == null) {
                this.req_unix = DEFAULT_REQ_UNIX;
            } else {
                this.req_unix = l;
            }
            Integer num2 = builder.user_tips_type;
            if (num2 == null) {
                this.user_tips_type = DEFAULT_USER_TIPS_TYPE;
            } else {
                this.user_tips_type = num2;
            }
            String str4 = builder.top_tips;
            if (str4 == null) {
                this.top_tips = "";
            } else {
                this.top_tips = str4;
            }
            this.banner_follow_live = builder.banner_follow_live;
            this.hot_recomforum = builder.hot_recomforum;
            String str5 = builder.abtest_tag;
            if (str5 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str5;
            }
            List<App> list3 = builder.app_list;
            if (list3 == null) {
                this.app_list = DEFAULT_APP_LIST;
                return;
            } else {
                this.app_list = list3;
                return;
            }
        }
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.page_tag = builder.page_tag;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.has_more = builder.has_more;
        this.user_tips = builder.user_tips;
        this.banner_user_story = builder.banner_user_story;
        this.last_tips = builder.last_tips;
        this.top_user_info = builder.top_user_info;
        this.req_unix = builder.req_unix;
        this.user_tips_type = builder.user_tips_type;
        this.top_tips = builder.top_tips;
        this.banner_follow_live = builder.banner_follow_live;
        this.hot_recomforum = builder.hot_recomforum;
        this.abtest_tag = builder.abtest_tag;
        this.app_list = builder.app_list;
    }
}
