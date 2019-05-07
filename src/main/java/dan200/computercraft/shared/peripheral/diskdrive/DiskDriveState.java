/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2019. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.peripheral.diskdrive;

import net.minecraft.util.SnakeCaseIdentifiable;

public enum DiskDriveState implements SnakeCaseIdentifiable
{
    EMPTY( "empty" ),
    FULL( "full" ),
    INVALID( "invalid" );

    private final String name;

    DiskDriveState( String name )
    {
        this.name = name;
    }


    @Override
    public String toSnakeCase()
    {
        return name;
    }
}