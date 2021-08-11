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
public final class HistoryForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final Integer DEFAULT_FOLLOW_NUM;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Boolean DEFAULT_HAS_POSTPRE;
    public static final Integer DEFAULT_HOT_NUM;
    public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
    public static final Integer DEFAULT_IS_LIVEFORUM;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final Boolean DEFAULT_NEED_TRANS;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO;
    public static final Integer DEFAULT_UNREAD_NUM;
    public static final String DEFAULT_VISIT_TIME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 14)
    public final BlockPopInfo block_pop_info;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer follow_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 18, type = Message.Datatype.BOOL)
    public final Boolean has_postpre;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer hot_num;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_forum_business_account;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_liveforum;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 19)
    public final PostPrefix post_prefix;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 8)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer unread_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String visit_time;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HistoryForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public BlockPopInfo block_pop_info;
        public Integer follow_num;
        public Long forum_id;
        public String forum_name;
        public Boolean has_postpre;
        public Integer hot_num;
        public Integer is_forum_business_account;
        public Integer is_liveforum;
        public Integer level_id;
        public Boolean need_trans;
        public PostPrefix post_prefix;
        public List<FrsTabInfo> tab_info;
        public ThemeColorInfo theme_color;
        public Integer unread_num;
        public String visit_time;

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
        public Builder(HistoryForumInfo historyForumInfo) {
            super(historyForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {historyForumInfo};
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
            if (historyForumInfo == null) {
                return;
            }
            this.forum_id = historyForumInfo.forum_id;
            this.forum_name = historyForumInfo.forum_name;
            this.avatar = historyForumInfo.avatar;
            this.is_liveforum = historyForumInfo.is_liveforum;
            this.unread_num = historyForumInfo.unread_num;
            this.visit_time = historyForumInfo.visit_time;
            this.follow_num = historyForumInfo.follow_num;
            this.theme_color = historyForumInfo.theme_color;
            this.need_trans = historyForumInfo.need_trans;
            this.block_pop_info = historyForumInfo.block_pop_info;
            this.hot_num = historyForumInfo.hot_num;
            this.level_id = historyForumInfo.level_id;
            this.tab_info = Message.copyOf(historyForumInfo.tab_info);
            this.has_postpre = historyForumInfo.has_postpre;
            this.post_prefix = historyForumInfo.post_prefix;
            this.is_forum_business_account = historyForumInfo.is_forum_business_account;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistoryForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HistoryForumInfo(this, z, null) : (HistoryForumInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1854967626, "Ltbclient/HistoryForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1854967626, "Ltbclient/HistoryForumInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_IS_LIVEFORUM = 0;
        DEFAULT_UNREAD_NUM = 0;
        DEFAULT_FOLLOW_NUM = 0;
        DEFAULT_NEED_TRANS = Boolean.FALSE;
        DEFAULT_HOT_NUM = 0;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_TAB_INFO = Collections.emptyList();
        DEFAULT_HAS_POSTPRE = Boolean.FALSE;
        DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = 0;
    }

    public /* synthetic */ HistoryForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryForumInfo(Builder builder, boolean z) {
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
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.is_liveforum;
            if (num == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = num;
            }
            Integer num2 = builder.unread_num;
            if (num2 == null) {
                this.unread_num = DEFAULT_UNREAD_NUM;
            } else {
                this.unread_num = num2;
            }
            String str3 = builder.visit_time;
            if (str3 == null) {
                this.visit_time = "";
            } else {
                this.visit_time = str3;
            }
            Integer num3 = builder.follow_num;
            if (num3 == null) {
                this.follow_num = DEFAULT_FOLLOW_NUM;
            } else {
                this.follow_num = num3;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            this.block_pop_info = builder.block_pop_info;
            Integer num4 = builder.hot_num;
            if (num4 == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num4;
            }
            Integer num5 = builder.level_id;
            if (num5 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num5;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
            }
            Boolean bool2 = builder.has_postpre;
            if (bool2 == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = bool2;
            }
            this.post_prefix = builder.post_prefix;
            Integer num6 = builder.is_forum_business_account;
            if (num6 == null) {
                this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
                return;
            } else {
                this.is_forum_business_account = num6;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_liveforum = builder.is_liveforum;
        this.unread_num = builder.unread_num;
        this.visit_time = builder.visit_time;
        this.follow_num = builder.follow_num;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.block_pop_info = builder.block_pop_info;
        this.hot_num = builder.hot_num;
        this.level_id = builder.level_id;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.has_postpre = builder.has_postpre;
        this.post_prefix = builder.post_prefix;
        this.is_forum_business_account = builder.is_forum_business_account;
    }
}
