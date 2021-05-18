package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class CardForum extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer card_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PersonalForum> forum_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long position;
    public static final List<PersonalForum> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Long DEFAULT_POSITION = 0L;
    public static final Integer DEFAULT_CARD_TYPE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<CardForum> {
        public String card_title;
        public Integer card_type;
        public List<PersonalForum> forum_list;
        public Long position;

        public Builder() {
        }

        public Builder(CardForum cardForum) {
            super(cardForum);
            if (cardForum == null) {
                return;
            }
            this.card_title = cardForum.card_title;
            this.forum_list = Message.copyOf(cardForum.forum_list);
            this.position = cardForum.position;
            this.card_type = cardForum.card_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardForum build(boolean z) {
            return new CardForum(this, z);
        }
    }

    public CardForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            List<PersonalForum> list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            Long l = builder.position;
            if (l == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = l;
            }
            Integer num = builder.card_type;
            if (num == null) {
                this.card_type = DEFAULT_CARD_TYPE;
                return;
            } else {
                this.card_type = num;
                return;
            }
        }
        this.card_title = builder.card_title;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.position = builder.position;
        this.card_type = builder.card_type;
    }
}
