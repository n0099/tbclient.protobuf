package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ActiveCenter extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_FIRST_UP;
    public static final Integer DEFAULT_IS_NEW_WINDOW;
    public static final List<ActiveCenterStatus> DEFAULT_MISSION_STATUS_LIST;
    public static final String DEFAULT_WIN_DESC = "";
    public static final Integer DEFAULT_WIN_JUMP_TIME;
    public static final String DEFAULT_WIN_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_first_up;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_new_window;
    @ProtoField(tag = 3)
    public final ActiveCenterMission mission;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ActiveCenterStatus> mission_status_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String win_desc;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer win_jump_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String win_title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ActiveCenter> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_first_up;
        public Integer is_new_window;
        public ActiveCenterMission mission;
        public List<ActiveCenterStatus> mission_status_list;
        public String win_desc;
        public Integer win_jump_time;
        public String win_title;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ActiveCenter activeCenter) {
            super(activeCenter);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {activeCenter};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (activeCenter == null) {
                return;
            }
            this.win_title = activeCenter.win_title;
            this.win_desc = activeCenter.win_desc;
            this.mission = activeCenter.mission;
            this.mission_status_list = Message.copyOf(activeCenter.mission_status_list);
            this.win_jump_time = activeCenter.win_jump_time;
            this.is_new_window = activeCenter.is_new_window;
            this.is_first_up = activeCenter.is_first_up;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActiveCenter build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ActiveCenter(this, z, null) : (ActiveCenter) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-990103562, "Ltbclient/ActiveCenter;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-990103562, "Ltbclient/ActiveCenter;");
                return;
            }
        }
        DEFAULT_MISSION_STATUS_LIST = Collections.emptyList();
        DEFAULT_WIN_JUMP_TIME = 0;
        DEFAULT_IS_NEW_WINDOW = 0;
        DEFAULT_IS_FIRST_UP = 0;
    }

    public /* synthetic */ ActiveCenter(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveCenter(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.win_title;
            if (str == null) {
                this.win_title = "";
            } else {
                this.win_title = str;
            }
            String str2 = builder.win_desc;
            if (str2 == null) {
                this.win_desc = "";
            } else {
                this.win_desc = str2;
            }
            this.mission = builder.mission;
            List<ActiveCenterStatus> list = builder.mission_status_list;
            if (list == null) {
                this.mission_status_list = DEFAULT_MISSION_STATUS_LIST;
            } else {
                this.mission_status_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.win_jump_time;
            if (num == null) {
                this.win_jump_time = DEFAULT_WIN_JUMP_TIME;
            } else {
                this.win_jump_time = num;
            }
            Integer num2 = builder.is_new_window;
            if (num2 == null) {
                this.is_new_window = DEFAULT_IS_NEW_WINDOW;
            } else {
                this.is_new_window = num2;
            }
            Integer num3 = builder.is_first_up;
            if (num3 == null) {
                this.is_first_up = DEFAULT_IS_FIRST_UP;
                return;
            } else {
                this.is_first_up = num3;
                return;
            }
        }
        this.win_title = builder.win_title;
        this.win_desc = builder.win_desc;
        this.mission = builder.mission;
        this.mission_status_list = Message.immutableCopyOf(builder.mission_status_list);
        this.win_jump_time = builder.win_jump_time;
        this.is_new_window = builder.is_new_window;
        this.is_first_up = builder.is_first_up;
    }
}
