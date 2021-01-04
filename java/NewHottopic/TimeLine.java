package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class TimeLine extends Message {
    public static final List<TimeLineInfo> DEFAULT_TIMELINE_INFO = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<TimeLineInfo> timeline_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private TimeLine(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.timeline_info == null) {
                this.timeline_info = DEFAULT_TIMELINE_INFO;
                return;
            } else {
                this.timeline_info = immutableCopyOf(builder.timeline_info);
                return;
            }
        }
        this.title = builder.title;
        this.timeline_info = immutableCopyOf(builder.timeline_info);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TimeLine> {
        public List<TimeLineInfo> timeline_info;
        public String title;

        public Builder() {
        }

        public Builder(TimeLine timeLine) {
            super(timeLine);
            if (timeLine != null) {
                this.title = timeLine.title;
                this.timeline_info = TimeLine.copyOf(timeLine.timeline_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TimeLine build(boolean z) {
            return new TimeLine(this, z);
        }
    }
}
