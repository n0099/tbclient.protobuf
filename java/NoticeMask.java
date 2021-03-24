package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NoticeMask extends Message {
    public static final Integer DEFAULT_ATTR_TYPE = 0;
    public static final String DEFAULT_ATTR_VALUE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer attr_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String attr_value;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NoticeMask> {
        public Integer attr_type;
        public String attr_value;

        public Builder() {
        }

        public Builder(NoticeMask noticeMask) {
            super(noticeMask);
            if (noticeMask == null) {
                return;
            }
            this.attr_type = noticeMask.attr_type;
            this.attr_value = noticeMask.attr_value;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NoticeMask build(boolean z) {
            return new NoticeMask(this, z);
        }
    }

    public NoticeMask(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.attr_type;
            if (num == null) {
                this.attr_type = DEFAULT_ATTR_TYPE;
            } else {
                this.attr_type = num;
            }
            String str = builder.attr_value;
            if (str == null) {
                this.attr_value = "";
                return;
            } else {
                this.attr_value = str;
                return;
            }
        }
        this.attr_type = builder.attr_type;
        this.attr_value = builder.attr_value;
    }
}
