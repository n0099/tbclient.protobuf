package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotOfficialThread extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_THREAD_PIC = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_pic;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_ICON_TYPE = 0;

    /* synthetic */ HotOfficialThread(Builder builder, boolean z, HotOfficialThread hotOfficialThread) {
        this(builder, z);
    }

    private HotOfficialThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder._abstract == null) {
                this._abstract = "";
            } else {
                this._abstract = builder._abstract;
            }
            if (builder.icon_type == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = builder.icon_type;
            }
            if (builder.thread_pic == null) {
                this.thread_pic = "";
                return;
            } else {
                this.thread_pic = builder.thread_pic;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.icon_type = builder.icon_type;
        this.thread_pic = builder.thread_pic;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotOfficialThread> {
        public String _abstract;
        public Integer icon_type;
        public String thread_pic;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(HotOfficialThread hotOfficialThread) {
            super(hotOfficialThread);
            if (hotOfficialThread != null) {
                this.tid = hotOfficialThread.tid;
                this.title = hotOfficialThread.title;
                this._abstract = hotOfficialThread._abstract;
                this.icon_type = hotOfficialThread.icon_type;
                this.thread_pic = hotOfficialThread.thread_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotOfficialThread build(boolean z) {
            return new HotOfficialThread(this, z, null);
        }
    }
}
