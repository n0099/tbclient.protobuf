package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class LastViewFeeds extends Message {
    public static final List<Integer> DEFAULT_LIVE = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.UINT32)
    public final List<Integer> live;

    /* synthetic */ LastViewFeeds(Builder builder, boolean z, LastViewFeeds lastViewFeeds) {
        this(builder, z);
    }

    private LastViewFeeds(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.live == null) {
                this.live = DEFAULT_LIVE;
                return;
            } else {
                this.live = immutableCopyOf(builder.live);
                return;
            }
        }
        this.live = immutableCopyOf(builder.live);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<LastViewFeeds> {
        public List<Integer> live;

        public Builder() {
        }

        public Builder(LastViewFeeds lastViewFeeds) {
            super(lastViewFeeds);
            if (lastViewFeeds != null) {
                this.live = LastViewFeeds.copyOf(lastViewFeeds.live);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LastViewFeeds build(boolean z) {
            return new LastViewFeeds(this, z, null);
        }
    }
}
