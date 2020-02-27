package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TWGuideDesc extends Message {
    public static final String DEFAULT_LINK = "";
    public static final Integer DEFAULT_ORDER = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer order;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private TWGuideDesc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.order == null) {
                this.order = DEFAULT_ORDER;
            } else {
                this.order = builder.order;
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
        this.order = builder.order;
        this.title = builder.title;
        this.link = builder.link;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TWGuideDesc> {
        public String link;
        public Integer order;
        public String title;

        public Builder() {
        }

        public Builder(TWGuideDesc tWGuideDesc) {
            super(tWGuideDesc);
            if (tWGuideDesc != null) {
                this.order = tWGuideDesc.order;
                this.title = tWGuideDesc.title;
                this.link = tWGuideDesc.link;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TWGuideDesc build(boolean z) {
            return new TWGuideDesc(this, z);
        }
    }
}
