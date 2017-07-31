package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Focus extends Message {
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private Focus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.link == null) {
                this.link = "";
                return;
            } else {
                this.link = builder.link;
                return;
            }
        }
        this.time = builder.time;
        this.title = builder.title;
        this.link = builder.link;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Focus> {
        public String link;
        public Integer time;
        public String title;

        public Builder() {
        }

        public Builder(Focus focus) {
            super(focus);
            if (focus != null) {
                this.time = focus.time;
                this.title = focus.title;
                this.link = focus.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Focus build(boolean z) {
            return new Focus(this, z);
        }
    }
}
