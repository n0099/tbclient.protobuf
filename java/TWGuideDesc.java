package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TWGuideDesc> {
        public String link;
        public Integer order;
        public String title;

        public Builder() {
        }

        public Builder(TWGuideDesc tWGuideDesc) {
            super(tWGuideDesc);
            if (tWGuideDesc == null) {
                return;
            }
            this.order = tWGuideDesc.order;
            this.title = tWGuideDesc.title;
            this.link = tWGuideDesc.link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TWGuideDesc build(boolean z) {
            return new TWGuideDesc(this, z);
        }
    }

    public TWGuideDesc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.order;
            if (num == null) {
                this.order = DEFAULT_ORDER;
            } else {
                this.order = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.link;
            if (str2 == null) {
                this.link = "";
                return;
            } else {
                this.link = str2;
                return;
            }
        }
        this.order = builder.order;
        this.title = builder.title;
        this.link = builder.link;
    }
}
