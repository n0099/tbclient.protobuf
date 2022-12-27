package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class GroupFeedCard extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedGroupInfo> group_list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer index;
    public static final Integer DEFAULT_INDEX = 0;
    public static final List<FeedGroupInfo> DEFAULT_GROUP_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GroupFeedCard> {
        public String card_title;
        public List<FeedGroupInfo> group_list;
        public Integer index;

        public Builder() {
        }

        public Builder(GroupFeedCard groupFeedCard) {
            super(groupFeedCard);
            if (groupFeedCard == null) {
                return;
            }
            this.card_title = groupFeedCard.card_title;
            this.index = groupFeedCard.index;
            this.group_list = Message.copyOf(groupFeedCard.group_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GroupFeedCard build(boolean z) {
            return new GroupFeedCard(this, z);
        }
    }

    public GroupFeedCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            Integer num = builder.index;
            if (num == null) {
                this.index = DEFAULT_INDEX;
            } else {
                this.index = num;
            }
            List<FeedGroupInfo> list = builder.group_list;
            if (list == null) {
                this.group_list = DEFAULT_GROUP_LIST;
                return;
            } else {
                this.group_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.card_title = builder.card_title;
        this.index = builder.index;
        this.group_list = Message.immutableCopyOf(builder.group_list);
    }
}
