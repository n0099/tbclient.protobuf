package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes8.dex */
public final class CardGod extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    public static final List<User> DEFAULT_GODS = Collections.emptyList();
    public static final Integer DEFAULT_POSITION = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> gods;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer position;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<CardGod> {
        public String card_title;
        public List<User> gods;
        public Integer position;

        public Builder() {
        }

        public Builder(CardGod cardGod) {
            super(cardGod);
            if (cardGod == null) {
                return;
            }
            this.card_title = cardGod.card_title;
            this.gods = Message.copyOf(cardGod.gods);
            this.position = cardGod.position;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardGod build(boolean z) {
            return new CardGod(this, z);
        }
    }

    public CardGod(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            List<User> list = builder.gods;
            if (list == null) {
                this.gods = DEFAULT_GODS;
            } else {
                this.gods = Message.immutableCopyOf(list);
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
                return;
            } else {
                this.position = num;
                return;
            }
        }
        this.card_title = builder.card_title;
        this.gods = Message.immutableCopyOf(builder.gods);
        this.position = builder.position;
    }
}
