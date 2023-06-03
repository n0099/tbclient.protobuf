package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class Highlist extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<High> list;
    public static final List<High> DEFAULT_LIST = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Highlist> {
        public Boolean has_more;
        public List<High> list;

        public Builder() {
        }

        public Builder(Highlist highlist) {
            super(highlist);
            if (highlist == null) {
                return;
            }
            this.list = Message.copyOf(highlist.list);
            this.has_more = highlist.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Highlist build(boolean z) {
            return new Highlist(this, z);
        }
    }

    public Highlist(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<High> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            Boolean bool = builder.has_more;
            if (bool == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = bool;
                return;
            }
        }
        this.list = Message.immutableCopyOf(builder.list);
        this.has_more = builder.has_more;
    }
}
