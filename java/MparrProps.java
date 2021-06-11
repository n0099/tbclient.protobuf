package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<MparrProps> {
        public AvatarFrame avatarframe;
        public Level level;
        public Portrait portrait;
        public List<Props> props;

        public Builder() {
        }

        public Builder(MparrProps mparrProps) {
            super(mparrProps);
            if (mparrProps == null) {
                return;
            }
            this.avatarframe = mparrProps.avatarframe;
            this.portrait = mparrProps.portrait;
            this.level = mparrProps.level;
            this.props = Message.copyOf(mparrProps.props);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MparrProps build(boolean z) {
            return new MparrProps(this, z);
        }
    }

    public MparrProps(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.avatarframe = builder.avatarframe;
            this.portrait = builder.portrait;
            this.level = builder.level;
            List<Props> list = builder.props;
            if (list == null) {
                this.props = DEFAULT_PROPS;
                return;
            } else {
                this.props = Message.immutableCopyOf(list);
                return;
            }
        }
        this.avatarframe = builder.avatarframe;
        this.portrait = builder.portrait;
        this.level = builder.level;
        this.props = Message.immutableCopyOf(builder.props);
    }
}
