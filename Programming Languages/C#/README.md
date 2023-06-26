# Learning C# & Unity

Learning how to use C# and Unity. 

__Install C#__ <br> 
What you'll need: 
1. C# SDK 
2. C# Extension for Visual Studio Code
3. Folder Storing C# projects 

How to - Create a Project 
1. Verify and/or install latest updates for the SDK and VSC 
2. In CMD, navigate to the folder storing your C# projects 
3. type in `dotnet new console` 
- creates a basic console app 
- wait for process to finish >> successful message is `Restore succeeded` 
4. now type in code . to open in VSC 
5. start coding. 

How to - Run Project in Terminal 
1. CMD >> `dotnet run` >> `Enter`
2. Code runner extension in VSC 
- File >> Preferences >> `Run in Terminal` >> Check box >> open JSON Settings >> for `csharp` - enter `cd $dir && dotnet run $fileName` >> Save changes 

# Unity 
What you'll need: 
Unity Hub
Unity Editor 
Code Editor (i.e Visual Studio Code / Visual Studio)


__Configure Visual Studio Code with Unity__ 
1. Create a Project in Unity Hub 
2. In New Project - do the following: 
    - a. Import Visual Studio Code Package in Unity --> Packet Manager --> search for __Visual Studio Code__ --> Import 
    - b. File --> Preferences --> External Tools --> Change to Visual Studio Code 

<br> 

Alternatively, 
3. In Existing Project - do the following: 
    - a. Import Visual Studio Code Package in Unity (if needed) 
    - b. Change external tool to Visual Studio Code
4. Test if functions work when creating a Script file in Unity 
    - a. Open it up - should open in Visual Studio Code and must have a .csproj file in there 
    - b. Extensions like Intellisense should work 

__Troubleshooting Issues with Scripts__
1. Verify that VSC, Dotnet SDK, Unity Hub & Editor are all the latest versions / compatible with each other __(AS OF 2023)__
    - Dotnet SDK >> 8.0.100-preview.5.23303.2
    - Unity Hub >> 3.5.0
    - Unity Editor >> 2022.3.3f1
    - VSC >> 1.79.2


