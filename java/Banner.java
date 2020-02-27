package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class Banner extends Message {
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 4)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    private Banner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.pic == null) {
                this.pic = "";
            } else {
                this.pic = builder.pic;
            }
            this.thread_info = builder.thread_info;
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.id == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = builder.id;
                return;
            }
        }
        this.name = builder.name;
        this.desc = builder.desc;
        this.pic = builder.pic;
        this.thread_info = builder.thread_info;
        this.url = builder.url;
        this.id = builder.id;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<Banner> {
        public String desc;
        public Integer id;
        public String name;
        public String pic;
        public ThreadInfo thread_info;
        public String url;

        public Builder() {
        }

        public Builder(Banner banner) {
            super(banner);
            if (banner != null) {
                this.name = banner.name;
                this.desc = banner.desc;
                this.pic = banner.pic;
                this.thread_info = banner.thread_info;
                this.url = banner.url;
                this.id = banner.id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z);
        }
    }
}
