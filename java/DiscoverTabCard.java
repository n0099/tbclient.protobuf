package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class DiscoverTabCard extends Message {
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Boolean DEFAULT_IS_SHOW_ORDER_NUMBER = Boolean.FALSE;
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

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DiscoverTabCard> {
        public List<RecommendForumInfo> forum_list;
        public Boolean is_show_order_number;
        public String jump_name;
        public String name;

        public Builder() {
        }

        public Builder(DiscoverTabCard discoverTabCard) {
            super(discoverTabCard);
            if (discoverTabCard == null) {
                return;
            }
            this.name = discoverTabCard.name;
            this.forum_list = Message.copyOf(discoverTabCard.forum_list);
            this.jump_name = discoverTabCard.jump_name;
            this.is_show_order_number = discoverTabCard.is_show_order_number;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverTabCard build(boolean z) {
            return new DiscoverTabCard(this, z);
        }
    }

    public DiscoverTabCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            List<RecommendForumInfo> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.jump_name;
            if (str2 == null) {
                this.jump_name = "";
            } else {
                this.jump_name = str2;
            }
            Boolean bool = builder.is_show_order_number;
            if (bool == null) {
                this.is_show_order_number = DEFAULT_IS_SHOW_ORDER_NUMBER;
                return;
            } else {
                this.is_show_order_number = bool;
                return;
            }
        }
        this.name = builder.name;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.jump_name = builder.jump_name;
        this.is_show_order_number = builder.is_show_order_number;
    }
}
