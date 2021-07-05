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
/* loaded from: classes10.dex */
public final class UserStoryAlaLiveInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AGREE_NUM;
    public static final Long DEFAULT_FIRST_POST_ID;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_FREQ_NUM;
    public static final Long DEFAULT_FROM_THREAD_ID;
    public static final Integer DEFAULT_GOOD_TYPES;
    public static final Integer DEFAULT_IS_DELETED;
    public static final Integer DEFAULT_LAST_MODIFIED_TIME;
    public static final Integer DEFAULT_LAST_POST_DELETED;
    public static final Long DEFAULT_LAST_POST_ID;
    public static final Long DEFAULT_LAST_USER_ID;
    public static final Integer DEFAULT_LAST_USER_IP;
    public static final Long DEFAULT_LIVE_ID;
    public static final Integer DEFAULT_PHONE_TYPE;
    public static final Long DEFAULT_POST_NUM;
    public static final Integer DEFAULT_THREAD_CLASSES;
    public static final Long DEFAULT_THREAD_ID;
    public static final Integer DEFAULT_THREAD_TYPES;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TITLE_PREFIX = "";
    public static final Integer DEFAULT_TOP_TYPES;
    public static final Integer DEFAULT_TSTORE_TYPE;
    public static final Long DEFAULT_USER_ID;
    public static final Integer DEFAULT_USER_IP;
    public static final Long DEFAULT_VOTE_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 26, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 27)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long first_post_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer freq_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long from_thread_id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer good_types;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_deleted;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer last_modified_time;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer last_post_deleted;
    @ProtoField(tag = 16, type = Message.Datatype.INT64)
    public final Long last_post_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long last_user_id;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer last_user_ip;
    @ProtoField(tag = 24, type = Message.Datatype.INT64)
    public final Long live_id;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer phone_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long post_num;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer thread_classes;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer thread_types;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String title_prefix;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer top_types;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer tstore_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer user_ip;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long vote_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<UserStoryAlaLiveInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long agree_num;
        public AlaLiveInfo ala_info;
        public Long first_post_id;
        public Long forum_id;
        public String forum_name;
        public Integer freq_num;
        public Long from_thread_id;
        public Integer good_types;
        public Integer is_deleted;
        public Integer last_modified_time;
        public Integer last_post_deleted;
        public Long last_post_id;
        public Long last_user_id;
        public Integer last_user_ip;
        public Long live_id;
        public Integer phone_type;
        public Long post_num;
        public Integer thread_classes;
        public Long thread_id;
        public Integer thread_types;
        public String title;
        public String title_prefix;
        public Integer top_types;
        public Integer tstore_type;
        public Long user_id;
        public Integer user_ip;
        public Long vote_id;

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
        public Builder(UserStoryAlaLiveInfo userStoryAlaLiveInfo) {
            super(userStoryAlaLiveInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userStoryAlaLiveInfo};
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
            if (userStoryAlaLiveInfo == null) {
                return;
            }
            this.forum_id = userStoryAlaLiveInfo.forum_id;
            this.thread_id = userStoryAlaLiveInfo.thread_id;
            this.title = userStoryAlaLiveInfo.title;
            this.user_id = userStoryAlaLiveInfo.user_id;
            this.user_ip = userStoryAlaLiveInfo.user_ip;
            this.vote_id = userStoryAlaLiveInfo.vote_id;
            this.from_thread_id = userStoryAlaLiveInfo.from_thread_id;
            this.post_num = userStoryAlaLiveInfo.post_num;
            this.last_modified_time = userStoryAlaLiveInfo.last_modified_time;
            this.last_user_id = userStoryAlaLiveInfo.last_user_id;
            this.last_user_ip = userStoryAlaLiveInfo.last_user_ip;
            this.good_types = userStoryAlaLiveInfo.good_types;
            this.top_types = userStoryAlaLiveInfo.top_types;
            this.thread_types = userStoryAlaLiveInfo.thread_types;
            this.thread_classes = userStoryAlaLiveInfo.thread_classes;
            this.last_post_id = userStoryAlaLiveInfo.last_post_id;
            this.phone_type = userStoryAlaLiveInfo.phone_type;
            this.is_deleted = userStoryAlaLiveInfo.is_deleted;
            this.first_post_id = userStoryAlaLiveInfo.first_post_id;
            this.forum_name = userStoryAlaLiveInfo.forum_name;
            this.title_prefix = userStoryAlaLiveInfo.title_prefix;
            this.last_post_deleted = userStoryAlaLiveInfo.last_post_deleted;
            this.freq_num = userStoryAlaLiveInfo.freq_num;
            this.live_id = userStoryAlaLiveInfo.live_id;
            this.tstore_type = userStoryAlaLiveInfo.tstore_type;
            this.agree_num = userStoryAlaLiveInfo.agree_num;
            this.ala_info = userStoryAlaLiveInfo.ala_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserStoryAlaLiveInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserStoryAlaLiveInfo(this, z, null) : (UserStoryAlaLiveInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1169204949, "Ltbclient/UserStoryAlaLiveInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1169204949, "Ltbclient/UserStoryAlaLiveInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_USER_IP = 0;
        DEFAULT_VOTE_ID = 0L;
        DEFAULT_FROM_THREAD_ID = 0L;
        DEFAULT_POST_NUM = 0L;
        DEFAULT_LAST_MODIFIED_TIME = 0;
        DEFAULT_LAST_USER_ID = 0L;
        DEFAULT_LAST_USER_IP = 0;
        DEFAULT_GOOD_TYPES = 0;
        DEFAULT_TOP_TYPES = 0;
        DEFAULT_THREAD_TYPES = 0;
        DEFAULT_THREAD_CLASSES = 0;
        DEFAULT_LAST_POST_ID = 0L;
        DEFAULT_PHONE_TYPE = 0;
        DEFAULT_IS_DELETED = 0;
        DEFAULT_FIRST_POST_ID = 0L;
        DEFAULT_LAST_POST_DELETED = 0;
        DEFAULT_FREQ_NUM = 0;
        DEFAULT_LIVE_ID = 0L;
        DEFAULT_TSTORE_TYPE = 0;
        DEFAULT_AGREE_NUM = 0L;
    }

    public /* synthetic */ UserStoryAlaLiveInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStoryAlaLiveInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            Integer num = builder.user_ip;
            if (num == null) {
                this.user_ip = DEFAULT_USER_IP;
            } else {
                this.user_ip = num;
            }
            Long l4 = builder.vote_id;
            if (l4 == null) {
                this.vote_id = DEFAULT_VOTE_ID;
            } else {
                this.vote_id = l4;
            }
            Long l5 = builder.from_thread_id;
            if (l5 == null) {
                this.from_thread_id = DEFAULT_FROM_THREAD_ID;
            } else {
                this.from_thread_id = l5;
            }
            Long l6 = builder.post_num;
            if (l6 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l6;
            }
            Integer num2 = builder.last_modified_time;
            if (num2 == null) {
                this.last_modified_time = DEFAULT_LAST_MODIFIED_TIME;
            } else {
                this.last_modified_time = num2;
            }
            Long l7 = builder.last_user_id;
            if (l7 == null) {
                this.last_user_id = DEFAULT_LAST_USER_ID;
            } else {
                this.last_user_id = l7;
            }
            Integer num3 = builder.last_user_ip;
            if (num3 == null) {
                this.last_user_ip = DEFAULT_LAST_USER_IP;
            } else {
                this.last_user_ip = num3;
            }
            Integer num4 = builder.good_types;
            if (num4 == null) {
                this.good_types = DEFAULT_GOOD_TYPES;
            } else {
                this.good_types = num4;
            }
            Integer num5 = builder.top_types;
            if (num5 == null) {
                this.top_types = DEFAULT_TOP_TYPES;
            } else {
                this.top_types = num5;
            }
            Integer num6 = builder.thread_types;
            if (num6 == null) {
                this.thread_types = DEFAULT_THREAD_TYPES;
            } else {
                this.thread_types = num6;
            }
            Integer num7 = builder.thread_classes;
            if (num7 == null) {
                this.thread_classes = DEFAULT_THREAD_CLASSES;
            } else {
                this.thread_classes = num7;
            }
            Long l8 = builder.last_post_id;
            if (l8 == null) {
                this.last_post_id = DEFAULT_LAST_POST_ID;
            } else {
                this.last_post_id = l8;
            }
            Integer num8 = builder.phone_type;
            if (num8 == null) {
                this.phone_type = DEFAULT_PHONE_TYPE;
            } else {
                this.phone_type = num8;
            }
            Integer num9 = builder.is_deleted;
            if (num9 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = num9;
            }
            Long l9 = builder.first_post_id;
            if (l9 == null) {
                this.first_post_id = DEFAULT_FIRST_POST_ID;
            } else {
                this.first_post_id = l9;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            String str3 = builder.title_prefix;
            if (str3 == null) {
                this.title_prefix = "";
            } else {
                this.title_prefix = str3;
            }
            Integer num10 = builder.last_post_deleted;
            if (num10 == null) {
                this.last_post_deleted = DEFAULT_LAST_POST_DELETED;
            } else {
                this.last_post_deleted = num10;
            }
            Integer num11 = builder.freq_num;
            if (num11 == null) {
                this.freq_num = DEFAULT_FREQ_NUM;
            } else {
                this.freq_num = num11;
            }
            Long l10 = builder.live_id;
            if (l10 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l10;
            }
            Integer num12 = builder.tstore_type;
            if (num12 == null) {
                this.tstore_type = DEFAULT_TSTORE_TYPE;
            } else {
                this.tstore_type = num12;
            }
            Long l11 = builder.agree_num;
            if (l11 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = l11;
            }
            this.ala_info = builder.ala_info;
            return;
        }
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.title = builder.title;
        this.user_id = builder.user_id;
        this.user_ip = builder.user_ip;
        this.vote_id = builder.vote_id;
        this.from_thread_id = builder.from_thread_id;
        this.post_num = builder.post_num;
        this.last_modified_time = builder.last_modified_time;
        this.last_user_id = builder.last_user_id;
        this.last_user_ip = builder.last_user_ip;
        this.good_types = builder.good_types;
        this.top_types = builder.top_types;
        this.thread_types = builder.thread_types;
        this.thread_classes = builder.thread_classes;
        this.last_post_id = builder.last_post_id;
        this.phone_type = builder.phone_type;
        this.is_deleted = builder.is_deleted;
        this.first_post_id = builder.first_post_id;
        this.forum_name = builder.forum_name;
        this.title_prefix = builder.title_prefix;
        this.last_post_deleted = builder.last_post_deleted;
        this.freq_num = builder.freq_num;
        this.live_id = builder.live_id;
        this.tstore_type = builder.tstore_type;
        this.agree_num = builder.agree_num;
        this.ala_info = builder.ala_info;
    }
}
