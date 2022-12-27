package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ChannelModuleInfo extends Message {
    public static final String DEFAULT_TYPE = "";
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
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_HAS_SECOND_PAGE = 0;
    public static final List<RecomTopicList> DEFAULT_HOT_TOPIC = Collections.emptyList();
    public static final List<DiscoverTabCard> DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    public static final List<User> DEFAULT_RECOMMEND_USER = Collections.emptyList();
    public static final List<OperationColumn> DEFAULT_OPERATION_COLUMN = Collections.emptyList();
    public static final List<OperationActivity> DEFAULT_OPERATION_ACTIVITY = Collections.emptyList();
    public static final List<ItemRankModule> DEFAULT_RECOMMEND_ITEM = Collections.emptyList();
    public static final List<ItemRankModule> DEFAULT_ITEM_RANK = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChannelModuleInfo> {
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
        }

        public Builder(ChannelModuleInfo channelModuleInfo) {
            super(channelModuleInfo);
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
            return new ChannelModuleInfo(this, z);
        }
    }

    public ChannelModuleInfo(Builder builder, boolean z) {
        super(builder);
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
}
