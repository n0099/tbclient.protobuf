package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class ParrProps extends Message {
    public static final Integer DEFAULT_PORTRAIT_TIME = 0;
    public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 2)
    public final Level level;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer portrait_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Props> props;

    private ParrProps(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.portrait_time == null) {
                this.portrait_time = DEFAULT_PORTRAIT_TIME;
            } else {
                this.portrait_time = builder.portrait_time;
            }
            this.level = builder.level;
            if (builder.props == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = immutableCopyOf(builder.props);
                return;
            }
        }
        this.portrait_time = builder.portrait_time;
        this.level = builder.level;
        this.props = immutableCopyOf(builder.props);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ParrProps> {
        public Level level;
        public Integer portrait_time;
        public List<Props> props;

        public Builder() {
        }

        public Builder(ParrProps parrProps) {
            super(parrProps);
            if (parrProps != null) {
                this.portrait_time = parrProps.portrait_time;
                this.level = parrProps.level;
                this.props = ParrProps.copyOf(parrProps.props);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ParrProps build(boolean z) {
            return new ParrProps(this, z);
        }
    }
}
