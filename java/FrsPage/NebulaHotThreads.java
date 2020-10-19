package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class NebulaHotThreads extends Message {
    public static final List<NebulaHotThread> DEFAULT_THREADS = Collections.emptyList();
    public static final String DEFAULT_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<NebulaHotThread> threads;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    private NebulaHotThreads(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.threads == null) {
                this.threads = DEFAULT_THREADS;
                return;
            } else {
                this.threads = immutableCopyOf(builder.threads);
                return;
            }
        }
        this.url = builder.url;
        this.threads = immutableCopyOf(builder.threads);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<NebulaHotThreads> {
        public List<NebulaHotThread> threads;
        public String url;

        public Builder() {
        }

        public Builder(NebulaHotThreads nebulaHotThreads) {
            super(nebulaHotThreads);
            if (nebulaHotThreads != null) {
                this.url = nebulaHotThreads.url;
                this.threads = NebulaHotThreads.copyOf(nebulaHotThreads.threads);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NebulaHotThreads build(boolean z) {
            return new NebulaHotThreads(this, z);
        }
    }
}
