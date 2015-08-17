package tbclient.GetNewGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class RunningGame extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<NewGameInfo> future;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<NewGameInfo> today;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<NewGameInfo> tomorrow;
    public static final List<NewGameInfo> DEFAULT_TODAY = Collections.emptyList();
    public static final List<NewGameInfo> DEFAULT_TOMORROW = Collections.emptyList();
    public static final List<NewGameInfo> DEFAULT_FUTURE = Collections.emptyList();

    /* synthetic */ RunningGame(Builder builder, boolean z, RunningGame runningGame) {
        this(builder, z);
    }

    private RunningGame(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.today == null) {
                this.today = DEFAULT_TODAY;
            } else {
                this.today = immutableCopyOf(builder.today);
            }
            if (builder.tomorrow == null) {
                this.tomorrow = DEFAULT_TOMORROW;
            } else {
                this.tomorrow = immutableCopyOf(builder.tomorrow);
            }
            if (builder.future == null) {
                this.future = DEFAULT_FUTURE;
                return;
            } else {
                this.future = immutableCopyOf(builder.future);
                return;
            }
        }
        this.today = immutableCopyOf(builder.today);
        this.tomorrow = immutableCopyOf(builder.tomorrow);
        this.future = immutableCopyOf(builder.future);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<RunningGame> {
        public List<NewGameInfo> future;
        public List<NewGameInfo> today;
        public List<NewGameInfo> tomorrow;

        public Builder() {
        }

        public Builder(RunningGame runningGame) {
            super(runningGame);
            if (runningGame != null) {
                this.today = RunningGame.copyOf(runningGame.today);
                this.tomorrow = RunningGame.copyOf(runningGame.tomorrow);
                this.future = RunningGame.copyOf(runningGame.future);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RunningGame build(boolean z) {
            return new RunningGame(this, z, null);
        }
    }
}
