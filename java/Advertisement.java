package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class Advertisement extends Message {
    public static final String DEFAULT_ADVERTISEMENT_ID = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_PIC_CLICK = "";
    public static final Long DEFAULT_TIME = 0L;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String advertisement_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_click;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Advertisement> {
        public String advertisement_id;
        public String jump_link;
        public String pic;
        public String pic_click;
        public Long time;

        public Builder() {
        }

        public Builder(Advertisement advertisement) {
            super(advertisement);
            if (advertisement == null) {
                return;
            }
            this.time = advertisement.time;
            this.pic = advertisement.pic;
            this.pic_click = advertisement.pic_click;
            this.jump_link = advertisement.jump_link;
            this.advertisement_id = advertisement.advertisement_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Advertisement build(boolean z) {
            return new Advertisement(this, z);
        }
    }

    public Advertisement(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            String str2 = builder.pic_click;
            if (str2 == null) {
                this.pic_click = "";
            } else {
                this.pic_click = str2;
            }
            String str3 = builder.jump_link;
            if (str3 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str3;
            }
            String str4 = builder.advertisement_id;
            if (str4 == null) {
                this.advertisement_id = "";
                return;
            } else {
                this.advertisement_id = str4;
                return;
            }
        }
        this.time = builder.time;
        this.pic = builder.pic;
        this.pic_click = builder.pic_click;
        this.jump_link = builder.jump_link;
        this.advertisement_id = builder.advertisement_id;
    }
}
