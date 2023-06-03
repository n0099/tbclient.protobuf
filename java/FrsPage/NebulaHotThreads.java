package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class NebulaHotThreads extends Message {
    public static final List<NebulaHotThread> DEFAULT_THREADS = Collections.emptyList();
    public static final String DEFAULT_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<NebulaHotThread> threads;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<NebulaHotThreads> {
        public List<NebulaHotThread> threads;
        public String url;

        public Builder() {
        }

        public Builder(NebulaHotThreads nebulaHotThreads) {
            super(nebulaHotThreads);
            if (nebulaHotThreads == null) {
                return;
            }
            this.url = nebulaHotThreads.url;
            this.threads = Message.copyOf(nebulaHotThreads.threads);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NebulaHotThreads build(boolean z) {
            return new NebulaHotThreads(this, z);
        }
    }

    public NebulaHotThreads(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            List<NebulaHotThread> list = builder.threads;
            if (list == null) {
                this.threads = DEFAULT_THREADS;
                return;
            } else {
                this.threads = Message.immutableCopyOf(list);
                return;
            }
        }
        this.url = builder.url;
        this.threads = Message.immutableCopyOf(builder.threads);
    }
}
