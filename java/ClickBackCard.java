package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ClickBackCard extends Message {
    public static final List<ClickBackCardItem> DEFAULT_CARD_LIST = Collections.emptyList();
    public static final String DEFAULT_CARD_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ClickBackCardItem> card_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ClickBackCard> {
        public List<ClickBackCardItem> card_list;
        public String card_name;

        public Builder() {
        }

        public Builder(ClickBackCard clickBackCard) {
            super(clickBackCard);
            if (clickBackCard == null) {
                return;
            }
            this.card_name = clickBackCard.card_name;
            this.card_list = Message.copyOf(clickBackCard.card_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClickBackCard build(boolean z) {
            return new ClickBackCard(this, z);
        }
    }

    public ClickBackCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_name;
            if (str == null) {
                this.card_name = "";
            } else {
                this.card_name = str;
            }
            List<ClickBackCardItem> list = builder.card_list;
            if (list == null) {
                this.card_list = DEFAULT_CARD_LIST;
                return;
            } else {
                this.card_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.card_name = builder.card_name;
        this.card_list = Message.immutableCopyOf(builder.card_list);
    }
}
