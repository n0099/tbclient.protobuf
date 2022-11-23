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
public final class ChannelModuleInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_HAS_SECOND_PAGE;
    public static final List<RecomTopicList> DEFAULT_HOT_TOPIC;
    public static final List<ItemRankModule> DEFAULT_ITEM_RANK;
    public static final List<OperationActivity> DEFAULT_OPERATION_ACTIVITY;
    public static final List<OperationColumn> DEFAULT_OPERATION_COLUMN;
    public static final Integer DEFAULT_POSITION;
    public static final List<DiscoverTabCard> DEFAULT_RECOMMEND_FORUM;
    public static final List<ItemRankModule> DEFAULT_RECOMMEND_ITEM;
    public static final List<User> DEFAULT_RECOMMEND_USER;
    public static final String DEFAULT_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_second_page;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<RecomTopicList> hot_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<ItemRankModule> item_rank;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<OperationActivity> operation_activity;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<OperationColumn> operation_column;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer position;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<DiscoverTabCard> recommend_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<ItemRankModule> recommend_item;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<User> recommend_user;
    @ProtoField(tag = 3)
    public final ModuleTitleInfo title_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String type;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChannelModuleInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer has_second_page;
        public List<RecomTopicList> hot_topic;
        public List<ItemRankModule> item_rank;
        public List<OperationActivity> operation_activity;
        public List<OperationColumn> operation_column;
        public Integer position;
        public List<DiscoverTabCard> recommend_forum;
        public List<ItemRankModule> recommend_item;
        public List<User> recommend_user;
        public ModuleTitleInfo title_info;
        public String type;

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
        public Builder(ChannelModuleInfo channelModuleInfo) {
            super(channelModuleInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {channelModuleInfo};
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
            if (channelModuleInfo == null) {
                return;
            }
            this.position = channelModuleInfo.position;
            this.type = channelModuleInfo.type;
            this.title_info = channelModuleInfo.title_info;
            this.has_second_page = channelModuleInfo.has_second_page;
            this.hot_topic = Message.copyOf(channelModuleInfo.hot_topic);
            this.recommend_forum = Message.copyOf(channelModuleInfo.recommend_forum);
            this.recommend_user = Message.copyOf(channelModuleInfo.recommend_user);
            this.operation_column = Message.copyOf(channelModuleInfo.operation_column);
            this.operation_activity = Message.copyOf(channelModuleInfo.operation_activity);
            this.recommend_item = Message.copyOf(channelModuleInfo.recommend_item);
            this.item_rank = Message.copyOf(channelModuleInfo.item_rank);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChannelModuleInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ChannelModuleInfo(this, z, null);
            }
            return (ChannelModuleInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(174664616, "Ltbclient/ChannelModuleInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(174664616, "Ltbclient/ChannelModuleInfo;");
                return;
            }
        }
        DEFAULT_POSITION = 0;
        DEFAULT_HAS_SECOND_PAGE = 0;
        DEFAULT_HOT_TOPIC = Collections.emptyList();
        DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
        DEFAULT_RECOMMEND_USER = Collections.emptyList();
        DEFAULT_OPERATION_COLUMN = Collections.emptyList();
        DEFAULT_OPERATION_ACTIVITY = Collections.emptyList();
        DEFAULT_RECOMMEND_ITEM = Collections.emptyList();
        DEFAULT_ITEM_RANK = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelModuleInfo(Builder builder, boolean z) {
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
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            this.title_info = builder.title_info;
            Integer num2 = builder.has_second_page;
            if (num2 == null) {
                this.has_second_page = DEFAULT_HAS_SECOND_PAGE;
            } else {
                this.has_second_page = num2;
            }
            List<RecomTopicList> list = builder.hot_topic;
            if (list == null) {
                this.hot_topic = DEFAULT_HOT_TOPIC;
            } else {
                this.hot_topic = Message.immutableCopyOf(list);
            }
            List<DiscoverTabCard> list2 = builder.recommend_forum;
            if (list2 == null) {
                this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
            } else {
                this.recommend_forum = Message.immutableCopyOf(list2);
            }
            List<User> list3 = builder.recommend_user;
            if (list3 == null) {
                this.recommend_user = DEFAULT_RECOMMEND_USER;
            } else {
                this.recommend_user = Message.immutableCopyOf(list3);
            }
            List<OperationColumn> list4 = builder.operation_column;
            if (list4 == null) {
                this.operation_column = DEFAULT_OPERATION_COLUMN;
            } else {
                this.operation_column = Message.immutableCopyOf(list4);
            }
            List<OperationActivity> list5 = builder.operation_activity;
            if (list5 == null) {
                this.operation_activity = DEFAULT_OPERATION_ACTIVITY;
            } else {
                this.operation_activity = Message.immutableCopyOf(list5);
            }
            List<ItemRankModule> list6 = builder.recommend_item;
            if (list6 == null) {
                this.recommend_item = DEFAULT_RECOMMEND_ITEM;
            } else {
                this.recommend_item = Message.immutableCopyOf(list6);
            }
            List<ItemRankModule> list7 = builder.item_rank;
            if (list7 == null) {
                this.item_rank = DEFAULT_ITEM_RANK;
                return;
            } else {
                this.item_rank = Message.immutableCopyOf(list7);
                return;
            }
        }
        this.position = builder.position;
        this.type = builder.type;
        this.title_info = builder.title_info;
        this.has_second_page = builder.has_second_page;
        this.hot_topic = Message.immutableCopyOf(builder.hot_topic);
        this.recommend_forum = Message.immutableCopyOf(builder.recommend_forum);
        this.recommend_user = Message.immutableCopyOf(builder.recommend_user);
        this.operation_column = Message.immutableCopyOf(builder.operation_column);
        this.operation_activity = Message.immutableCopyOf(builder.operation_activity);
        this.recommend_item = Message.immutableCopyOf(builder.recommend_item);
        this.item_rank = Message.immutableCopyOf(builder.item_rank);
    }

    public /* synthetic */ ChannelModuleInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
