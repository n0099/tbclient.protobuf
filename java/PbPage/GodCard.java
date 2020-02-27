package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GodCard extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SHOW_FLOOR = 0;
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer show_floor;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String time_ex;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    private GodCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.time_ex == null) {
                this.time_ex = "";
            } else {
                this.time_ex = builder.time_ex;
            }
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.button_text == null) {
                this.button_text = "";
            } else {
                this.button_text = builder.button_text;
            }
            if (builder.button_url == null) {
                this.button_url = "";
            } else {
                this.button_url = builder.button_url;
            }
            if (builder.show_floor == null) {
                this.show_floor = DEFAULT_SHOW_FLOOR;
                return;
            } else {
                this.show_floor = builder.show_floor;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.time_ex = builder.time_ex;
        this.text = builder.text;
        this.pic_url = builder.pic_url;
        this.button_text = builder.button_text;
        this.button_url = builder.button_url;
        this.show_floor = builder.show_floor;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GodCard> {
        public String button_text;
        public String button_url;
        public String pic_url;
        public String portrait;
        public Integer show_floor;
        public String text;
        public String time_ex;
        public String user_name;

        public Builder() {
        }

        public Builder(GodCard godCard) {
            super(godCard);
            if (godCard != null) {
                this.user_name = godCard.user_name;
                this.portrait = godCard.portrait;
                this.time_ex = godCard.time_ex;
                this.text = godCard.text;
                this.pic_url = godCard.pic_url;
                this.button_text = godCard.button_text;
                this.button_url = godCard.button_url;
                this.show_floor = godCard.show_floor;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodCard build(boolean z) {
            return new GodCard(this, z);
        }
    }
}
