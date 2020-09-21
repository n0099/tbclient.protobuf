package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class CardTopic extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer position;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TopicInfo> topic_list;
    public static final List<TopicInfo> DEFAULT_TOPIC_LIST = Collections.emptyList();
    public static final Integer DEFAULT_POSITION = 0;

    private CardTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.card_title == null) {
                this.card_title = "";
            } else {
                this.card_title = builder.card_title;
            }
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
            }
            if (builder.position == null) {
                this.position = DEFAULT_POSITION;
                return;
            } else {
                this.position = builder.position;
                return;
            }
        }
        this.card_title = builder.card_title;
        this.topic_list = immutableCopyOf(builder.topic_list);
        this.position = builder.position;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<CardTopic> {
        public String card_title;
        public Integer position;
        public List<TopicInfo> topic_list;

        public Builder() {
        }

        public Builder(CardTopic cardTopic) {
            super(cardTopic);
            if (cardTopic != null) {
                this.card_title = cardTopic.card_title;
                this.topic_list = CardTopic.copyOf(cardTopic.topic_list);
                this.position = cardTopic.position;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardTopic build(boolean z) {
            return new CardTopic(this, z);
        }
    }
}
