package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeColorInfo;
import tbclient.ThreadInfo;
/* loaded from: classes10.dex */
public final class HeaderCard extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 3)
    public final ThemeColorInfo card_background;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 4)
    public final HeadCardCover cover;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<HeaderCard> {
        public ThemeColorInfo card_background;
        public String card_title;
        public HeadCardCover cover;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(HeaderCard headerCard) {
            super(headerCard);
            if (headerCard == null) {
                return;
            }
            this.card_title = headerCard.card_title;
            this.thread_list = Message.copyOf(headerCard.thread_list);
            this.card_background = headerCard.card_background;
            this.cover = headerCard.cover;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeaderCard build(boolean z) {
            return new HeaderCard(this, z);
        }
    }

    public HeaderCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            this.card_background = builder.card_background;
            this.cover = builder.cover;
            return;
        }
        this.card_title = builder.card_title;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.card_background = builder.card_background;
        this.cover = builder.cover;
    }
}
