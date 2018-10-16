package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class MparrProps extends Message {
    public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
    @ProtoField(tag = 1)
    public final AvatarFrame avatarframe;
    @ProtoField(tag = 3)
    public final Level level;
    @ProtoField(tag = 2)
    public final Portrait portrait;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Props> props;

    private MparrProps(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.avatarframe = builder.avatarframe;
            this.portrait = builder.portrait;
            this.level = builder.level;
            if (builder.props == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = immutableCopyOf(builder.props);
                return;
            }
        }
        this.avatarframe = builder.avatarframe;
        this.portrait = builder.portrait;
        this.level = builder.level;
        this.props = immutableCopyOf(builder.props);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<MparrProps> {
        public AvatarFrame avatarframe;
        public Level level;
        public Portrait portrait;
        public List<Props> props;

        public Builder() {
        }

        public Builder(MparrProps mparrProps) {
            super(mparrProps);
            if (mparrProps != null) {
                this.avatarframe = mparrProps.avatarframe;
                this.portrait = mparrProps.portrait;
                this.level = mparrProps.level;
                this.props = MparrProps.copyOf(mparrProps.props);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MparrProps build(boolean z) {
            return new MparrProps(this, z);
        }
    }
}
