package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeColorInfo;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class HotCard extends Message {
    public static final String DEFAULT_CARD_TITLE = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_JUMP_TEXT = "";
    @ProtoField(tag = 2)
    public final ThemeColorInfo card_background;
    @ProtoField(tag = 8)
    public final ThemeColorInfo card_icon;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer card_offset;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String card_title;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_text;
    @ProtoField(tag = 3)
    public final ThemeColorInfo post_color;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CARD_OFFSET = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HotCard> {
        public ThemeColorInfo card_background;
        public ThemeColorInfo card_icon;
        public Integer card_offset;
        public String card_title;
        public String jump_link;
        public String jump_text;
        public ThemeColorInfo post_color;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(HotCard hotCard) {
            super(hotCard);
            if (hotCard == null) {
                return;
            }
            this.card_title = hotCard.card_title;
            this.card_background = hotCard.card_background;
            this.post_color = hotCard.post_color;
            this.jump_text = hotCard.jump_text;
            this.thread_list = Message.copyOf(hotCard.thread_list);
            this.card_offset = hotCard.card_offset;
            this.jump_link = hotCard.jump_link;
            this.card_icon = hotCard.card_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotCard build(boolean z) {
            return new HotCard(this, z);
        }
    }

    public HotCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.card_title;
            if (str == null) {
                this.card_title = "";
            } else {
                this.card_title = str;
            }
            this.card_background = builder.card_background;
            this.post_color = builder.post_color;
            String str2 = builder.jump_text;
            if (str2 == null) {
                this.jump_text = "";
            } else {
                this.jump_text = str2;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.card_offset;
            if (num == null) {
                this.card_offset = DEFAULT_CARD_OFFSET;
            } else {
                this.card_offset = num;
            }
            String str3 = builder.jump_link;
            if (str3 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str3;
            }
            this.card_icon = builder.card_icon;
            return;
        }
        this.card_title = builder.card_title;
        this.card_background = builder.card_background;
        this.post_color = builder.post_color;
        this.jump_text = builder.jump_text;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.card_offset = builder.card_offset;
        this.jump_link = builder.jump_link;
        this.card_icon = builder.card_icon;
    }
}
