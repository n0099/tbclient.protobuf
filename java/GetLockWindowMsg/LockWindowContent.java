package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class LockWindowContent extends Message {
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public static final String DEFAULT_SRC = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer during_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer origin_size;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String small_pic;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String src;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Integer DEFAULT_ORIGIN_SIZE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<LockWindowContent> {
        public String big_pic;
        public Integer during_time;
        public Integer height;
        public String link;
        public Integer origin_size;
        public String small_pic;
        public String src;
        public String text;
        public Integer type;
        public Integer width;

        public Builder() {
        }

        public Builder(LockWindowContent lockWindowContent) {
            super(lockWindowContent);
            if (lockWindowContent == null) {
                return;
            }
            this.type = lockWindowContent.type;
            this.text = lockWindowContent.text;
            this.small_pic = lockWindowContent.small_pic;
            this.big_pic = lockWindowContent.big_pic;
            this.width = lockWindowContent.width;
            this.height = lockWindowContent.height;
            this.during_time = lockWindowContent.during_time;
            this.origin_size = lockWindowContent.origin_size;
            this.link = lockWindowContent.link;
            this.src = lockWindowContent.src;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LockWindowContent build(boolean z) {
            return new LockWindowContent(this, z);
        }
    }

    public LockWindowContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.small_pic;
            if (str2 == null) {
                this.small_pic = "";
            } else {
                this.small_pic = str2;
            }
            String str3 = builder.big_pic;
            if (str3 == null) {
                this.big_pic = "";
            } else {
                this.big_pic = str3;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            Integer num4 = builder.during_time;
            if (num4 == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = num4;
            }
            Integer num5 = builder.origin_size;
            if (num5 == null) {
                this.origin_size = DEFAULT_ORIGIN_SIZE;
            } else {
                this.origin_size = num5;
            }
            String str4 = builder.link;
            if (str4 == null) {
                this.link = "";
            } else {
                this.link = str4;
            }
            String str5 = builder.src;
            if (str5 == null) {
                this.src = "";
                return;
            } else {
                this.src = str5;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
        this.width = builder.width;
        this.height = builder.height;
        this.during_time = builder.during_time;
        this.origin_size = builder.origin_size;
        this.link = builder.link;
        this.src = builder.src;
    }
}
