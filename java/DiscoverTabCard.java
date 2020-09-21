package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class DiscoverTabCard extends Message {
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Boolean DEFAULT_IS_SHOW_ORDER_NUMBER = false;
    public static final String DEFAULT_JUMP_NAME = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecommendForumInfo> forum_list;
    @ProtoField(tag = 4, type = Message.Datatype.BOOL)
    public final Boolean is_show_order_number;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    private DiscoverTabCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
            }
            if (builder.jump_name == null) {
                this.jump_name = "";
            } else {
                this.jump_name = builder.jump_name;
            }
            if (builder.is_show_order_number == null) {
                this.is_show_order_number = DEFAULT_IS_SHOW_ORDER_NUMBER;
                return;
            } else {
                this.is_show_order_number = builder.is_show_order_number;
                return;
            }
        }
        this.name = builder.name;
        this.forum_list = immutableCopyOf(builder.forum_list);
        this.jump_name = builder.jump_name;
        this.is_show_order_number = builder.is_show_order_number;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DiscoverTabCard> {
        public List<RecommendForumInfo> forum_list;
        public Boolean is_show_order_number;
        public String jump_name;
        public String name;

        public Builder() {
        }

        public Builder(DiscoverTabCard discoverTabCard) {
            super(discoverTabCard);
            if (discoverTabCard != null) {
                this.name = discoverTabCard.name;
                this.forum_list = DiscoverTabCard.copyOf(discoverTabCard.forum_list);
                this.jump_name = discoverTabCard.jump_name;
                this.is_show_order_number = discoverTabCard.is_show_order_number;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverTabCard build(boolean z) {
            return new DiscoverTabCard(this, z);
        }
    }
}
